package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepo extends JpaRepository<Country,Integer> {
}
