package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.ClientRepo;
import com.KindSourcegenius.fleetappmaster.model.Client;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientService {

    @Autowired
    private ClientRepo clientRepo;


    public List<Client> findAll(){
        return clientRepo.findAll();
    }
    public Optional<Client>findById(int id){
        return clientRepo.findById(id);
    }


}
