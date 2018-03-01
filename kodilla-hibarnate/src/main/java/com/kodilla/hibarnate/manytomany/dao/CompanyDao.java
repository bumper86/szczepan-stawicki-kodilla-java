package com.kodilla.hibarnate.manytomany.dao;

import com.kodilla.hibarnate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {
}
