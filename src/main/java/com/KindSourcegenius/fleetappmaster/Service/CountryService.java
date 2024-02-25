package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.CountryRepo;
import com.KindSourcegenius.fleetappmaster.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepo;

    public List<Country>findAll(){
      return   countryRepo.findAll();
    }

    public Optional<Country>findById(int id){
        return countryRepo.findById(id);

    }
    public void deleteCountry(int id){
        countryRepo.deleteById(id);
    }
    public Country country(Country country){
        return countryRepo.save(country);
    }



}
