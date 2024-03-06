package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.VehicleStatusService;
import com.KindSourcegenius.fleetappmaster.model.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;
@Controller
public class VehicleStatusController {

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @GetMapping("/AllVehicleStatuses")
    public String findAll(Model model ){
        model.addAttribute("VehicleStatuses",vehicleStatusService.findAll());
        return "VehicleStatus";
    }
    @PostMapping("/findVehicleStatusById")
    public Optional<VehicleStatus>findById(int id){
        return vehicleStatusService.FindById(id);
    }
    @PutMapping("/addNewVehicleStatus")
    public String addNew(VehicleStatus vehicleStatus){
        vehicleStatusService.saveVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatuses";
    }

    @PutMapping("/updateVehicleStatus")
    public String update(VehicleStatus vehicleStatus){
        vehicleStatusService.saveVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatuses";
    }
    @DeleteMapping("/deleteVehicleStatusBYId")
    public String delete(int id){
        vehicleStatusService.deleteVehicleStatus(id);
        return "redirect:/vehicleStatuses";

    }




}
