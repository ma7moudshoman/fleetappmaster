package com.KindSourcegenius.fleetappmaster.Controller;


import com.KindSourcegenius.fleetappmaster.Service.*;
import com.KindSourcegenius.fleetappmaster.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Controller
public class VehicleController {

     @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleTypeService vehicleTypeService;
    @Autowired
    private VehicleMakeService vehicleMakeService;
    @Autowired
    private VehicleModelService vehicleModelService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private EmployeeService employeeService ;
    @Autowired
    VehicleStatusService vehicleStatusService;

@GetMapping("/AllVehicle")
public String findAll(Model model){
    model.addAttribute("vehicle",vehicleService.findAll());
    model.addAttribute("vehicleType",vehicleTypeService.findAll());
    model.addAttribute("vehicleMake",vehicleMakeService.findAll());
    model.addAttribute("VehicleModel",vehicleModelService.findAll());
    model.addAttribute("locations",locationService.findAll());
    model.addAttribute("employees",employeeService.findAll());
    model.addAttribute("vehicleStatuses",vehicleStatusService.findAll());
    return "vehicle";
}
@PutMapping("/addNewVehicle")
public String addNew(Vehicle vehicle){
    vehicleService.saveVehicle(vehicle);
    return "redirect:/vehicles";
}
@PutMapping("/updateVehicle")
public String update(Vehicle vehicle){
    vehicleService.saveVehicle(vehicle);
    return "redirect:/vehicles";

}
@PostMapping("/findVehicleById")
public Optional<Vehicle>findById(int id){
    return vehicleService.findById(id);
}
@DeleteMapping("/deleteVehicle")
public String deleteVehicle(int id){
vehicleService.deleteByID(id);
    return "redirect:/vehicles";

}





}
