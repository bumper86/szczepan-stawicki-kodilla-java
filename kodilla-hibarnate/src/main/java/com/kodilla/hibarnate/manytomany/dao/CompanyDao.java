package com.kodilla.hibarnate.manytomany.dao;

import com.kodilla.hibarnate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyName(@Param("FIRSTTHREELETTERS") String firstthreeletters);

    @Query
    List<Company> findName(@Param("NAME") String key);
}
