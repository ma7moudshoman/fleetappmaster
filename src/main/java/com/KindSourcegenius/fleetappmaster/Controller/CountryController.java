package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;



    @GetMapping("/countries")
    public String findAll(Model model){
        model.addAttribute("countries",countryService.findAll());
        return "country";
    }

    @PostMapping("/addCountry")
    public String addCountry(Country country){
        countryService.savecountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("countries/findById")
    @ResponseBody
    public Optional<Country> findById(int id){
       return countryService.findById(id);

    }

    @DeleteMapping("/deleteCountryById")
    public String deleteCountry(int id){
        countryService.deleteCountry(id);
        return "redirect:/countries";
    }
    @PutMapping("/updateCountry")
    public String updateCountry(Country country){
        countryService.savecountry(country);
        return "redirect:/countries";
    }


}
