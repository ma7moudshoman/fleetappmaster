package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.UserRepo;
import com.KindSourcegenius.fleetappmaster.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;
    public List<User>findAll(){
        return userRepo.findAll();
    }
    public User findById(int id){
        return userRepo.findById(id).orElse(null);
    }
    public void deleteUser(int id){
        userRepo.deleteById(id);
    }
    public void SaveUser(User user){
        user.setPassword(user.getPassword());
        userRepo.save(user);
    }

}
