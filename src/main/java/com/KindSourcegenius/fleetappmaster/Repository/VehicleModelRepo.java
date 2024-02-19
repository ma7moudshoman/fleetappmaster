package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepo extends JpaRepository<VehicleModel,Integer> {
}
