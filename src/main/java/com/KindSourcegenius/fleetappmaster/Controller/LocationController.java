package com.KindSourcegenius.fleetappmaster.Controller;


import com.KindSourcegenius.fleetappmaster.Service.CountryService;
import com.KindSourcegenius.fleetappmaster.Service.LocationService;
import com.KindSourcegenius.fleetappmaster.Service.StateService;
import com.KindSourcegenius.fleetappmaster.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Location")
public class LocationController {

    @Autowired
    private LocationService locationService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;

    @GetMapping("/findAllLocations")
    public  String findAll(Model model){
        model.addAttribute("location",locationService.findAll());
        model.addAttribute("country",countryService.findAll());
        model.addAttribute("state",stateService.findAll());
        return "location";
    }

    @PostMapping("/findLocationById")
    public Optional<Location>FindById( int id){
        return locationService.findById(id);
    }

    @PutMapping("/addLocation")
    public String addNew( Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    @GetMapping("/findByDescriptionContaining/{description}")
    public List<Location>findByDescriptionContaining(@PathVariable("description")String description){
        return locationService.findByDescriptionContaining(description);
    }

    @PutMapping("/updateLocation")
    public String updateLocation(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    @DeleteMapping("deleteLocationByID")
    public String deleteLocation(int id){
        locationService.deleteLocation(id);
        return "redirect:/locations";

    }





}
