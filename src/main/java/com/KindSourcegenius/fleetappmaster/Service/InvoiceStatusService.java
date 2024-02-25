package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.InvoiceStatusRepo;
import com.KindSourcegenius.fleetappmaster.model.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepo invoiceStatusRepo;

    public List<InvoiceStatus>findAllInvoiceStatus(){
        return invoiceStatusRepo.findAll();
    }

    public Optional<InvoiceStatus>findById(int id){
        return invoiceStatusRepo.findById(id);
    }
    public void deleteInvoiceStatus(int id){
         invoiceStatusRepo.deleteById(id);
    }
    public void  saveInvoiceStatus( InvoiceStatus invoiceStatus){
        invoiceStatusRepo.save(invoiceStatus);
    }




}
