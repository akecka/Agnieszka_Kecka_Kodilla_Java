package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseFacadeTestSuite {

    @Autowired
    private DatabaseFacade databaseFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private  CompanyDao companyDao;

    @Test
    public void testEmployeeFacade() {
        //Given
        Employee employee = new Employee("Bibbit", "Gently");
        employeeDao.save(employee);

        //When
        List<Employee> nameList = databaseFacade.findLastNameLike("entl");
        //Then
        try {
            Assert.assertEquals(1, nameList.size());

        } finally {
            //Clean up
            employeeDao.delete(employee);

        }

    }

    @Test
    public void testCompanyFacade() {
        //Given
        Company company = new Company("Microsoft");
        companyDao.save(company);

        //When
        List<Company> companies = databaseFacade.findNamesLike("Micr");
        //Then
        try {
            Assert.assertEquals(1, companies.size());

        } finally {
            //Clean up
            companyDao.delete(company);

        }
    }
}
