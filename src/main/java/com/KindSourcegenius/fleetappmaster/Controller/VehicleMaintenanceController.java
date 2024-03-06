package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.SupplierService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleMaintenanceService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleService;
import com.KindSourcegenius.fleetappmaster.model.VehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleMaintenanceController {

    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/findAllVehicleMain")
    public String findAll(Model model){
        model.addAttribute("VehicleMaintenance",vehicleMaintenanceService.findAll());
        model.addAttribute("vehicles",vehicleService.findAll());
        model.addAttribute("Suppliers",supplierService.findAll());
        return "vehicleMaintenance";
    }

    @PostMapping("/findVehicleMainById")
    public Optional<VehicleMaintenance>findById(int id){
        return vehicleMaintenanceService.findById(id);
    }
    @PutMapping("/addNewVehicle")
    public String addNewVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.saveVehicleMaintenance(vehicleMaintenance);
        return "redirect:/vehicleMaintenances";
    }

    @PutMapping("/updateVehicleMaintenance")
    public String updateVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.saveVehicleMaintenance(vehicleMaintenance);
        return "redirect:/vehicleMaintenances";
    }
    @DeleteMapping("/deleteVehicle")
    public String deleteVehicleMaintenance(int id){
        vehicleMaintenanceService.deleteVehicleMaintenance(id);
        return "redirect:/vehicleMaintenances";
    }


}
