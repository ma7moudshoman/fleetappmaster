package com.KindSourcegenius.fleetappmaster.Service;


import com.KindSourcegenius.fleetappmaster.Repository.VehicleMovementRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {


    @Autowired
    private VehicleMovementRepo vehicleMovementRepo;

    public List<VehicleMovement>findAll(){
        return vehicleMovementRepo.findAll();
    }
    public Optional<VehicleMovement>findById(int id){
        return vehicleMovementRepo.findById(id);
    }

    public void saveVehicleMovement(VehicleMovement vehicleMovement){
        vehicleMovementRepo.save(vehicleMovement);
    }

    public void deleteVehicleMovement(int id){
        vehicleMovementRepo.findById(id);
    }
}
