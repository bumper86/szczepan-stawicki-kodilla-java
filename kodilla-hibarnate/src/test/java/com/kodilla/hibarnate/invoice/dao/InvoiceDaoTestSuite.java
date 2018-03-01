package com.kodilla.hibarnate.invoice.dao;

import com.kodilla.hibarnate.invoice.Invoice;
import com.kodilla.hibarnate.invoice.Item;
import com.kodilla.hibarnate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Apple");
        Product product1 = new Product("Smasung");
        Product product2 = new Product("Xiaomi");

        Invoice invoice = new Invoice("1/03/2018");

        Item item = new Item(product, new BigDecimal(1900), 2, new BigDecimal(3800));
        Item item1 = new Item(product1, new BigDecimal(1500), 3, new BigDecimal(4500));
        Item item2 = new Item(product2, new BigDecimal(500),1, new BigDecimal(500));

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
