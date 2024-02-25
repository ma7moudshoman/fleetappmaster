package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.VehicleHireRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleHire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {

    @Autowired
    private VehicleHireRepo vehicleHireRepo;

    public List<VehicleHire>findAll(){
        return vehicleHireRepo.findAll();
    }
    public Optional<VehicleHire>findById(int id){
        return vehicleHireRepo.findById(id);
    }
    public void saveVehicleHire(VehicleHire vehicleHire){
        vehicleHireRepo.save(vehicleHire);
    }
    public void deleteVehicleHire(int id){
        vehicleHireRepo.deleteById(id);
    }


}
