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
        Invoice invoice = new Invoice();

        Product bike = new Product("Bike");
        Product car = new Product("Ford");

        Item item1 = new Item(new BigDecimal(2000), 1, new BigDecimal(2000));
        Item item2 = new Item(new BigDecimal(3000), 2, new BigDecimal(6000));
        item1.setProduct(bike);
        item2.setProduct(car);

        invoice.setItems(Arrays.asList(item1, item2));
        invoice.setNumber("234/10/FV/2017");

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Invoice foundInvoice = invoiceDao.findOne(id);
        //Then
        Assert.assertEquals(invoice, foundInvoice);

        //Clean up
        invoiceDao.delete(id);

    }

}
