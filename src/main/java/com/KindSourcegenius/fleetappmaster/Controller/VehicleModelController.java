package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.VehicleModelService;
import com.KindSourcegenius.fleetappmaster.model.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleModelController {

    @Autowired
    private VehicleModelService vehicleModelService;
    @GetMapping("/AllVehicleMidel")
    public String findAll(Model model){
        model.addAttribute("VehicleModel",vehicleModelService.findAll());
        return "VehicleModel";
    }
    @PostMapping("/FindVehicleById")
    public Optional<VehicleModel>findById(int id){
        return vehicleModelService.findById(id);
    }
    @PutMapping("/addNewVehicle")
    public String addNew(VehicleModel vehicleModel){
        vehicleModelService.saveVehicleModel(vehicleModel);
        return "redirect:/VehicleModel";
    }
    @PutMapping("/updateVehicle")
    public String update(VehicleModel vehicleModel){
        vehicleModelService.saveVehicleModel(vehicleModel);
        return "redirect:/VehicleModels";
    }
    @DeleteMapping("/deleteVehicleModelById")
    public String deleteVehicleModel(int id){
        vehicleModelService.deleteVehicleModelById(id);
        return "redirect:/VehicleModels";

    }

}
