package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.VehicleTypeService;
import com.KindSourcegenius.fleetappmaster.model.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/AllVehicleType")
    public String findAll(Model model ){
        model.addAttribute("VehicleType",vehicleTypeService.findAll());
        return "vehicleType";
    }
    @PutMapping("/addNewVehicleById")
    public String addNew(VehicleType vehicleType){
        vehicleTypeService.saveVehicleType(vehicleType);
        return "redirect:/vehicleTypes";

    }

    @PostMapping("/findVehicleById")
    public Optional<VehicleType>findById(int id){
        return   vehicleTypeService.findById(id);
    }
    @PutMapping("/updateVehicleTypeById")
    public String update(VehicleType vehicleType){
        vehicleTypeService.saveVehicleType(vehicleType);
      return   "redirect:/vehicleTypes";
    }
    @DeleteMapping("/deleteVehicleById")
    public String delete(int id){
        vehicleTypeService.deleteVehicleType(id);
        return "redirect:/vehicleTypes";
    }

}
