package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.VehicleStatusRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepo vehicleStatusRepo;

    public List<VehicleStatus>findAll(){
        return vehicleStatusRepo.findAll();
    }

    public Optional<VehicleStatus>FindById(int id){
        return vehicleStatusRepo.findById(id);
    }

    public void saveVehicleStatus(VehicleStatus vehicleStatus){
        vehicleStatusRepo.save(vehicleStatus);
    }
    public void deleteVehicleStatus(int id){
        vehicleStatusRepo.deleteById(id);
    }


}
