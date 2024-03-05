package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.Service.StateService;
import com.KindSourcegenius.fleetappmaster.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;


    @GetMapping("/findAll")
    public String findAll(Model model ){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("country", countryService.findAll());
        return "state";
    }
    @GetMapping("/FindStateByID")
    public Optional<State>findById(int id){
        return stateService.findById(id);
    }

    @PutMapping("/addNewState")
    public String addNew(State state){
        stateService.saveState( state);
        return "redirect:/states";
    }
    @PutMapping("/updateState")
    public String updateState(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }
    @DeleteMapping("/deleteState")
    public String deleteState(int id){
        stateService.deleteState(id);
        return "redirect:/states";
    }



}
