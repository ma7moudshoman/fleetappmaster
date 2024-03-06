package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.VehicleMakeService;
import com.KindSourcegenius.fleetappmaster.model.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleMakeController {

    @Autowired
    private VehicleMakeService vehicleMakeService;
    @GetMapping("/findAllVehicle")
    public  String findAll(Model model){
        model.addAttribute("vehicleMakes",vehicleMakeService.findAll());
        return "vehicles";
    }

    @PostMapping("/findVehicleMakeById")
    public Optional<VehicleMake>findById(int id){
        return vehicleMakeService.FindById(id);
    }

    @PutMapping("/addNewVehicleMake")
    public String addnew(VehicleMake vehicleMake){
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/vehicleMakes";

    }

    @PutMapping("/updateVehicle")
    public String update(VehicleMake vehicleMake){
        vehicleMakeService.saveVehicleMake(vehicleMake);
        return "redirect:/vehicleMakes";

    }
@DeleteMapping("/deleteVehicleMake")
    public String deleteVehicle(int id){
        vehicleMakeService.deleteVehicleMake(id);
        return "redirect:/vehicleMakes";

    }



}
