package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.ClientService;
import com.KindSourcegenius.fleetappmaster.Service.LocationService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleHireService;
import com.KindSourcegenius.fleetappmaster.Service.VehicleService;
import com.KindSourcegenius.fleetappmaster.model.VehicleHire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;


@Controller
public class VehicleHireController {
    @Autowired
    private VehicleHireService vehicleHireService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/allVehicle")
    public String findAll(Model model){
        model.addAttribute("vehicles",vehicleService.findAll());
        model.addAttribute("clients",clientService.findAll());
        model.addAttribute("locations",locationService.findAll());
        model.addAttribute("vehiclesHire",vehicleHireService.findAll());
        return "vehicleHire";
    }
    @PostMapping("/findVehicleHireById")
    public Optional<VehicleHire>findById(int id){
        return vehicleHireService.findById(id);
    }
    @PutMapping("/addNewVehicleHire")
    public String addNew(VehicleHire vehicleHire){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehicleHires";
    }
    @PostMapping("/updateVehicleHire")
    public String update(VehicleHire vehicleHire){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehicleHires";

    }
    @DeleteMapping("/deleteVehicleHireById")
    public String delete(int id){
        vehicleHireService.deleteVehicleHire(id);
        return "redirect:/vehicleHires";

    }


}
