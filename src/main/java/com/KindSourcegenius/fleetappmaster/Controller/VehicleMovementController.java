package com.KindSourcegenius.fleetappmaster.Controller;


import com.KindSourcegenius.fleetappmaster.Service.LocationService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleMovementService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleService;
import com.KindSourcegenius.fleetappmaster.model.VehicleMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleMovementController {

    @Autowired
    private VehicleMovementService vehicleMovementService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/allVehicle")
    public String findAll(Model model){
        model.addAttribute("vehicleMovements",vehicleMovementService.findAll());
        model.addAttribute("locations",locationService.findAll());
        model.addAttribute("vehicles",vehicleService.findAll());
        return "vehicleMovement";
    }

    @PostMapping("/findVehicleById")
    private Optional<VehicleMovement>findById(int id){
        return vehicleMovementService.findById(id);
    }

    @PutMapping("/addNewVehicle")
    public String addNew(VehicleMovement vehicleMovement){
        vehicleMovementService.saveVehicleMovement(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @PutMapping("/updateVehicle")
    public String update(VehicleMovement vehicleMovement){
        vehicleMovementService.saveVehicleMovement(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @DeleteMapping("/deleteVehicleMovement")
    public String delete(int id){
        vehicleMovementService.deleteVehicleMovement(id);
        return "redirect:/vehicleMovements";
    }






}
