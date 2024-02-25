package com.KindSourcegenius.fleetappmaster.Service;


import com.KindSourcegenius.fleetappmaster.Repository.VehicleRepo;
import com.KindSourcegenius.fleetappmaster.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {


    @Autowired
    private VehicleRepo vehicleRepo;

    public List<Vehicle>findAll(){
        return vehicleRepo.findAll();
    }

    public Optional<Vehicle>findById(int id){
        return vehicleRepo.findById(id);
    }
    public void saveVehicle(Vehicle vehicle){
        vehicleRepo.save(vehicle);
    }



}
