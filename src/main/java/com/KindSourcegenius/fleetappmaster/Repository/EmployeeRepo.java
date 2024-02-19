package com.KindSourcegenius.fleetappmaster.Repository;

import com.KindSourcegenius.fleetappmaster.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    public Employee findByUsername(String name);


@Query(
        value = "select  * from Employee  e where e.firstname like %:keyword% or  e.lastname like %:keyword:%",nativeQuery = true)
  List<Employee>findByKeyword(@Param("keyword")String keyword);


}
