package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.StateRepo;
import com.KindSourcegenius.fleetappmaster.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {


    @Autowired
    private StateRepo stateRepo;

    public List<State>findAll()
    {
        return stateRepo.findAll();
    }
    public Optional<State>findById(int id){
        return stateRepo.findById(id);
    }
    public void saveState(State state){
        stateRepo.save(state);
    }
    public void deleteState(int id){
        stateRepo.deleteById(id);
    }


}
