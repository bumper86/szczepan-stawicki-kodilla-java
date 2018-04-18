package com.kodilla.hibarnate.manytomany.facade;

import com.kodilla.hibarnate.manytomany.Company;
import com.kodilla.hibarnate.manytomany.Employee;
import com.kodilla.hibarnate.manytomany.dao.CompanyDao;
import com.kodilla.hibarnate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public void save(Company company){
        companyDao.save(company);
    }

    public void delete(int id){
        companyDao.delete(id);
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee> searchEmployee(String search) throws SearchException {
        LOGGER.info("Searching for employees matching " + search);
        List<Employee> list = employeeDao.findMatchingName(search);
        if (list.size() < 1) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else  {
            LOGGER.info("List of employees matching");
            for (Employee employee : list) {
                LOGGER.info(employee.getFirstname() + " " + employee.getLastname());
            }
            return list;
        }
    }

    public List<Company> searchCompany(String search) throws SearchException {
        LOGGER.info("Searching for companies matching " + search);
        List<Company> list = companyDao.findName(search);
        if (list.size() < 1) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else  {
            LOGGER.info("List of companies matching");
            for (Company company : list) {
                LOGGER.info(company.getName());
            }
            return list;
        }
    }
}
