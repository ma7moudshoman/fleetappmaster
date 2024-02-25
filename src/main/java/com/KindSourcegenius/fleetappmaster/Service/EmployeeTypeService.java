package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.EmployeeTypeRepo;
import com.KindSourcegenius.fleetappmaster.model.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

@Autowired
    EmployeeTypeRepo employeeTypeRepo;


public List<EmployeeType> findAllEmployeeType(){
    return employeeTypeRepo.findAll();
}

public Optional<EmployeeType> findById(int id)
{
    return employeeTypeRepo.findById(id);
}
public void delete(int id){
    employeeTypeRepo.deleteById(id);
}
public void save(EmployeeType employeeType){
    employeeTypeRepo.save(employeeType);
}

}
