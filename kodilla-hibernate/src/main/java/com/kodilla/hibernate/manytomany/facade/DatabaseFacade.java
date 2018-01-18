package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
        @NamedQuery(
                name = "Company.getNameLike",
                query = "FROM COMPANY WHERE COMPANY_NAME LIKE %:ARG%"
        ),

        @NamedQuery(
                name = "Employee.getLastname",
                query = "FROM EMPLOYEE WHERE LASTNAME LIKE %:ARG%"
        )
})

@Service
public class DatabaseFacade {

    @Autowired
    private Employee employee;

    @Autowired
    private Company company;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

}
