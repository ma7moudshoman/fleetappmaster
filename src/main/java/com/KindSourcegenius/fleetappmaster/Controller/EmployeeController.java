package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.*;
import com.KindSourcegenius.fleetappmaster.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.Optional;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private StateService stateService;
    @Autowired
    private JobTitleService jobTitleService;
    @Autowired
    private EmployeeTypeService employeeTypeService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ServletContext context;

    public String findAll(Model model ,String Keyword){
    model.addAttribute("countries",countryService.findAll());
    model.addAttribute("States",stateService.findAll());
    model.addAttribute("jpdTitle",jobTitleService.findAll());
    model.addAttribute("employeeTypes",employeeTypeService.findAllEmployeeType());

    if (Keyword != null){
        model.addAttribute("employees",employeeService.findByKeyword(Keyword));
    }
    else {
        model.addAttribute("employees" ,employeeService.findAll());
    }
    return "employee";
}

@RequestMapping("employees/findById")
@ResponseBody
 public Optional<Employee>findById(int id){
        return employeeService.findById(id);
 }
 @PostMapping("/addNewEmployee")
 public  String addnew(Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
 }

 @PostMapping("employees/update")
 public String updateEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:/employee";
 }

 @DeleteMapping("employees/delete")
 public String deleteEmployee(int id){
        employeeService.delete(id);
        return  "redirect:/employee" ;
 }

 public ResponseEntity<Object>uploadFile(@RequestParam("file")MultipartFile file)throws IOException{
        File newFile=new File("//Users//kindsonmunonye//Documents//SOLUTIONS//fleetms//uploads//"+file.getOriginalFilename());
        newFile.createNewFile();
     FileOutputStream fout=new FileOutputStream(newFile);
     fout.write(file.getBytes());
     fout.close();
     return new ResponseEntity<>("File Uploaded Successfully ", HttpStatus.OK);
 }

    @PostMapping("/employees/uploadPhoto2")
    public String UploadeFile2(@RequestParam("file") MultipartFile file, Principal principal)
         throws IllegalStateException ,IOException{
        String baseDirectory="//Users//kindsonmunonye//Documents//SOLUTIONS//fleetms//src//main//resources//static//img//photos//" ;
        file.transferTo(new File(baseDirectory + principal.getName()+".jpa"));
        return "redirect:/employee";
     }

    @PostMapping("/employees/uploadPhoto3")
    public String uploadFile3(@RequestParam("file") MultipartFile file,Principal principal)
            throws 	IllegalStateException , IOException {
            String photosDir="/Users/kindsonmunonye/Documents/SOLUTIONS/fleetms/src/main/resources/static/img/photos/";
            file.transferTo(new File(photosDir+principal.getName()+".jps"));
            return "redirect:/employee";

         }
    @RequestMapping("/employees/profile")
         public String profile(Model model,Principal principal){
        String un=principal.getName();
        model.addAttribute("employee",employeeService.findByUsername(un));
        return "profile";
         }

    @GetMapping("employeesFilter")
    public String findByKeyword(Model model){
        model.addAttribute("countries",countryService.findAll());
        model.addAttribute("states",stateService.findAll());
        model.addAttribute("jobTitle",jobTitleService.findAll());
        model.addAttribute("employeeTypes",employeeTypeService.findAllEmployeeType());
        model.addAttribute("employees",employeeService.findAll());


        return "employeesFilter";

    }
    @RequestMapping( "/employees/assignUsername")
    private String assignUsername(int id){
        employeeService.assignUserName(id);
        return "redirect:/employees";
    }





}
