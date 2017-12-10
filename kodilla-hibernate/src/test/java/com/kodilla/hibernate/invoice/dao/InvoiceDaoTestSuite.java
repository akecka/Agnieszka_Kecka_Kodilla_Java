package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product bike = new Product("Bike");
        Product car = new Product("Ford");

        Item item1 = new Item(new BigDecimal(2000), 1, new BigDecimal(2000));
        Item item2 = new Item(new BigDecimal(3000), 2, new BigDecimal(6000));

        car.setItems(Arrays.asList(item1));
        bike.setItems(Arrays.asList(item2));

        item1.setProduct(car);
        item2.setProduct(bike);

        Invoice invoice = new Invoice("234/10/FV/2017");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        car.setItems(Arrays.asList(item1));
        bike.setItems(Arrays.asList(item2));

        invoiceDao.save(invoice);

        //When
        int id = invoice.getId();
        Invoice foundInvoice = invoiceDao.findOne(id);
        //Then
        Assert.assertEquals(id, foundInvoice.getId());
        Assert.assertEquals(invoice.getNumber(), foundInvoice.getNumber());
        Assert.assertEquals(invoice.getItems().size(), foundInvoice.getItems().size());

        //Clean up
        invoiceDao.delete(id);

    }

}
