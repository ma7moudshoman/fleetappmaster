package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.ContactService;
import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.Service.StateService;
import com.KindSourcegenius.fleetappmaster.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {


@Autowired
    private ContactService contactService;
@Autowired
    private CountryService countryService;
@Autowired
    private StateService stateService;




@GetMapping("/contacts")
public  String findAllContact(Model model){
    model.addAttribute("countries",countryService.findAll());
    model.addAttribute("contacts",contactService.FindAll());
    model.addAttribute("states" ,stateService.findAll());
    return "Contact";
}

@RequestMapping("/findById/contacts")
@ResponseBody
public Optional<Contact>findById(Integer id){
    return contactService.findById(id);
}
@PostMapping(value = "addNewContacts")
@ResponseBody
public String addNewContact(Contact contact){
    contactService.save(contact);
    return"redirect:/contacts";
}
@PutMapping("/updateContact")
public String update(Contact contact){
    contactService.save(contact);
    return "redirect:/contacts";
}
@DeleteMapping("/deleteContact")
public String delete(int id){
    contactService.delete(id);
    return "redirect:/contacts";
}













}
