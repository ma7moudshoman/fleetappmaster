package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.EmployeeTypeService;
import com.KindSourcegenius.fleetappmaster.model.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class EmployeeTypeController {


     @Autowired
      private EmployeeTypeService employeeTypeService;

     @GetMapping("employeesType")
     public  String findAll(Model model){
         model.addAttribute("employeeType" , employeeTypeService.findAllEmployeeType());
         return "employeeType";
     }

     @RequestMapping("/employeeTypes/findById")
     public Optional<EmployeeType>findByID(int id){
         return employeeTypeService.findById(id);
     }

     @PostMapping("employeeTypes/addNew")
     public  String addNew(EmployeeType employeeType){
         employeeTypeService.save(employeeType);
         return "redirect:/employeeTypes";
     }


     @PostMapping("employeeTypes/update")
     public  String Update(EmployeeType employeeType){
         employeeTypeService.save(employeeType);
         return "redirect:/employeeTypes";
     }

     @DeleteMapping("employeeTypes/delete")
     public String delete(int id){
         employeeTypeService.delete(id);
         return "redirect:/employeeTypes";
     }









}
