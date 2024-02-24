package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.ContactRepo;
import com.KindSourcegenius.fleetappmaster.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContactService {
    @Autowired
    private ContactRepo contactRepo;

    public List<Contact>FindAll(){
        return contactRepo.findAll();
    }
    public Optional<Contact>findById( int id){
        return contactRepo.findById(id);
    }
    public void delete(int id){
        contactRepo.deleteById(id);
    }
    public void save(Contact contact){
        contactRepo.save(contact);
    }


}
