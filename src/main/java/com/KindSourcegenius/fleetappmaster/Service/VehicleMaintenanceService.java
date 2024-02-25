package com.KindSourcegenius.fleetappmaster.Service;


import com.KindSourcegenius.fleetappmaster.Repository.VehicleMaintenanceRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {

    @Autowired
    private VehicleMaintenanceRepo vehicleMaintenanceRepo;


    public List<VehicleMaintenance> findAll(){
        return vehicleMaintenanceRepo.findAll();
    }
    public Optional<VehicleMaintenance>findById(int id){
        return vehicleMaintenanceRepo.findById(id);
    }
    public void saveVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceRepo.save(vehicleMaintenance);
    }
    public void deleteVehicleMaintenance(int id){
        vehicleMaintenanceRepo.deleteById(id);
    }

}
