package com.KindSourcegenius.fleetappmaster.Service;


import com.KindSourcegenius.fleetappmaster.Repository.VehicleTypeRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {


    @Autowired
    private VehicleTypeRepo vehicleTypeRepo;

    public List<VehicleType>findAll(){
       return vehicleTypeRepo.findAll();
    }
    public Optional<VehicleType>findById(int id){
        return vehicleTypeRepo.findById(id);
    }
    public void saveVehicleType(VehicleType vehicleType){
        vehicleTypeRepo.save(vehicleType);
    }
    public void deleteVehicleType(int id){
        vehicleTypeRepo.deleteById(id);
    }



}
