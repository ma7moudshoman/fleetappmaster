package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.VehicleMakeRepo;
import com.KindSourcegenius.fleetappmaster.model.VehicleMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {

@Autowired
    private VehicleMakeRepo vehicleMakeRepo;

        public List<VehicleMake>findAll(){
            return vehicleMakeRepo.findAll();
}

         public Optional<VehicleMake>FindById(int id)
         {
             return vehicleMakeRepo.findById(id);
         }
         public void saveVehicleMake(VehicleMake vehicleMake){
            vehicleMakeRepo.save(vehicleMake);
         }
         public void deleteVehicleMake(int id){
            vehicleMakeRepo.deleteById(id);
         }




}
