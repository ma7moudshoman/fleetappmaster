package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.LocationRepo;
import com.KindSourcegenius.fleetappmaster.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {


    @Autowired
    private LocationRepo locationRepo;

    public List<Location>findAll(){
        return (List<Location>) locationRepo.findAll();
    }
    public Optional<Location>findById(int id){
        return locationRepo.findById(id);
    }
    public void saveLocation(Location location)
    {
      locationRepo.save(location);
    }
    public void deleteLocation(int id){
        locationRepo.deleteById(id);
    }

    public List<Location>findByDescriptionContaining(String description){
        return null;
    }



}


