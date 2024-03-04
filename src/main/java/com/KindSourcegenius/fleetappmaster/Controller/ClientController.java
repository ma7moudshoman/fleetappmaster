package com.KindSourcegenius.fleetappmaster.Controller;


import com.KindSourcegenius.fleetappmaster.Service.ClientService;
import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.Service.StateService;
import com.KindSourcegenius.fleetappmaster.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public String findAll(Model model){
        model.addAttribute("Countres",countryService.findAll());
        model.addAttribute("States" , stateService.findAll());
        model.addAttribute("Client" , clientService.findAll());
        return "client";
    }


    @RequestMapping("/clients/findById")
    @ResponseBody
    public Optional<Client>findBuId(int id){
        return clientService.findById(id);
    }

    @PostMapping(value = "clients/addNew")
    public String addNewClient(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "clients/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String Update(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }


    @RequestMapping(value = "clients/delete" ,method = {RequestMethod.DELETE ,RequestMethod.GET})
    public String delete(int id){
        clientService.delete(id);
        return "redirect:/clients";
    }





}
