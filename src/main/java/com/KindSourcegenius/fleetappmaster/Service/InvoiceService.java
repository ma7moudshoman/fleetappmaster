package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.InvoiceRepo;
import com.KindSourcegenius.fleetappmaster.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
  private InvoiceRepo invoiceRepo;

    //Get All
    public List<Invoice>findAll(int id){
        return invoiceRepo.findAll();
    }

    //Get Invoice By Id
    public Optional<Invoice>findById(int id){
        return invoiceRepo.findById(id);
    }
    //Update Invoice

    public void saveInvoice(Invoice invoice){
        invoiceRepo.save(invoice);
    }
    //Delete Invoice
    public void deleteInvoice(int id){
        invoiceRepo.deleteById(id);
    }



}
