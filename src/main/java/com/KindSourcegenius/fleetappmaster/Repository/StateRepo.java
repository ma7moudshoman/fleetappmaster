package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepo extends JpaRepository<State,Integer> {
}
