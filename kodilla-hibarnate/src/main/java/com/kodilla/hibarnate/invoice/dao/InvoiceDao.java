package com.kodilla.hibarnate.invoice.dao;

import com.kodilla.hibarnate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice,Integer> {
}
