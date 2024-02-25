package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.SupplierRepo;
import com.KindSourcegenius.fleetappmaster.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;


    public List<Supplier>findAll(){
        return supplierRepo.findAll();
    }

    public Optional<Supplier>findById(int id){
        return supplierRepo.findById(id);
    }
    public void saveSupplier(Supplier supplier){
        supplierRepo.save(supplier);
    }
    public void deleteSupplier(int id){
        supplierRepo.deleteById(id);
    }

}
