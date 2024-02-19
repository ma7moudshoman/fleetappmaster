package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepo extends JpaRepository<VehicleStatus,Integer> {
}
