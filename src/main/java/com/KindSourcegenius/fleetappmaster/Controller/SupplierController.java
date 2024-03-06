package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.Service.StateService;
import com.KindSourcegenius.fleetappmaster.Service.SupplierService;
import com.KindSourcegenius.fleetappmaster.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;

    @GetMapping("/getAllSuppliers")
    public String findAll(Model model){
         model.addAttribute("states",stateService.findAll());
         model.addAttribute("suppliers",supplierService.findAll());
         model.addAttribute("countries",countryService.findAll());
         return "supplier";
    }

    @GetMapping("/findSupplierById")
    public Optional<Supplier>findById(int id){
        return supplierService.findById(id);
    }

    @PutMapping("/addNewSupplier")
    public String addNew(Supplier supplier){
        supplierService.saveSupplier( supplier);
        return "redirect:/suppliers";
    }
    @PutMapping("/updateSupplier")
    public String update(Supplier supplier){
        supplierService.saveSupplier(supplier);
    return "redirect:/suppliers";
    }

    @DeleteMapping("/deleteSupplier")
    public String deleteSupplier(int id){
        supplierService.deleteSupplier(id);
        return "redirect:/suppliers";
    }






}
