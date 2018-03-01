package com.kodilla.hibarnate.invoice.dao;

import com.kodilla.hibarnate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemDao extends CrudRepository<Item, Integer>{

}