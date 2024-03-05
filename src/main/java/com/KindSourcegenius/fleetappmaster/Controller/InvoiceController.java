package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.ClientService;
import com.KindSourcegenius.fleetappmaster.Service.InvoiceService;
import com.KindSourcegenius.fleetappmaster.Service.InvoiceStatusService;
import com.KindSourcegenius.fleetappmaster.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private InvoiceStatusService invoiceStatusService;
    @Autowired
    private ClientService clientService;


    @GetMapping("/allInvoice")
    public  String findAll(Model model){
        model.addAttribute("invoice",invoiceService.findAll());
        model.addAttribute("client",clientService.findAll());
        model.addAttribute("invoiceStatuses",invoiceService.findAll());
        return "invoice";
    }

@PostMapping("/addNewInvoice")
    public String addNewInvoice(Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }

    @PostMapping("/findByIdInvoice")
    public Optional<Invoice>findById(int id){
        return    invoiceService.findById(id);
    }

    @PutMapping("/updateInvoice")
    public String updateInvoice(Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }

    @DeleteMapping("/deleteInvoice")
    public String deleteInvoice(int id){
        invoiceService.deleteInvoice(id);
        return "redirect:/invoices";
    }


}
