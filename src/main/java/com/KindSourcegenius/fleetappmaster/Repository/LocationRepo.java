package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends CrudRepository<Location,Integer> {
}
