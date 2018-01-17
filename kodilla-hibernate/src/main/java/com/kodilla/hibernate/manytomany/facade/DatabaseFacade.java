package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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
                name = "Employee.getLastNameLike",
                query = "FROM EMPLOYEE WHERE LASTNAME LIKE %:ARG%"
        )
})

@Service
public class DatabaseFacade {

    @Autowired
    private Employee employee;

    @Autowired
    private Company company;

}
