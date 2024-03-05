package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.InvoiceStatusService;
import com.KindSourcegenius.fleetappmaster.model.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class InvoiceStatusController {

    @Autowired
    private InvoiceStatusService invoiceStatusService;



    @GetMapping("/allInvoice")
    public String findAll(Model model){
        model.addAttribute("invoiceStatuses" ,invoiceStatusService.findAllInvoiceStatus());
        return "invoiceStatus";
    }

    @PutMapping("/aggInvoice")
    public String addNew(InvoiceStatus invoiceStatus){
        invoiceStatusService.saveInvoiceStatus(invoiceStatus);
        return  "redirect:/invoiceStatuses";
    }

    @PutMapping("/findInvoiceById")
    public Optional<InvoiceStatus> findById(int id){
        return    invoiceStatusService.findById(id);
    }

    @PutMapping("updateInvoice")
    public String update(InvoiceStatus invoiceStatus){
    invoiceStatusService.saveInvoiceStatus(invoiceStatus);
    return "redirect:/invoiceStatuses";

    }
    @DeleteMapping("deleteInvoice")
    public String delete (int id){
        invoiceStatusService.deleteInvoiceStatus(id);
        return "redirect:/invoiceStatuses";
    }




}
