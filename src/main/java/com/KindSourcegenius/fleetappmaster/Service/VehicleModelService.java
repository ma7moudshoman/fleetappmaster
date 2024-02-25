package com.KindSourcegenius.fleetappmaster.Service;


import com.KindSourcegenius.fleetappmaster.Repository.VehicleModelRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {

    @Autowired
    private VehicleModelRepo vehicleModelRepo;

    public List<VehicleModel>findAll(){
        return vehicleModelRepo.findAll();
    }

    public Optional<VehicleModel>findById(int id){
        return vehicleModelRepo.findById(id);
    }

    public void saveVehicleModel(VehicleModel vehicleModel){
        vehicleModelRepo.save(vehicleModel);
    }

    public void deleteVehicleModelById(int id){
        vehicleModelRepo.deleteById(id);
    }


}
