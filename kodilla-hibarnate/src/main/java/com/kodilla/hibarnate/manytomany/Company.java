package com.kodilla.hibarnate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedNativeQuery(
        name = "Company.retrieveCompanyName",
        query = "SELECT * FROM COMPANIES" +
                " WHERE SUBSTR(COMPANY_NAME, 1, 3) = :FIRSTTHREELETTERS",
        resultClass = Company.class
)
@NamedQuery(
                name = "Company.findName",
                query = "FROM Companies WHERE COMPANY_NAME LIKE CONCAT('%',:NAME,'%')"
)
@Entity(name = "Company")
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}