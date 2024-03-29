package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.EmployeeRepo;
import com.KindSourcegenius.fleetappmaster.Repository.UserRepo;
import com.KindSourcegenius.fleetappmaster.model.Employee;
import com.KindSourcegenius.fleetappmaster.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepo employeeRepository;

	@Autowired
	UserRepo userRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}

	//Get employee by Keyword
	public List<Employee> findByKeyword(String keyword) {
		return employeeRepository.findByKeyword(keyword);
	}

	//Set the Username of the employee where firstname and lastname match
	public void  assignUserName(int id){
		Employee employee=employeeRepository.findById(id).orElse(null);
		try {
			User user=userRepository.findByFirstnameAndLastname(
					employee.getFirstname(),
					employee.getLastname());
			System.out.println(user);
			employee.setUsername(user.getUsername());
			employeeRepository.save(employee);

		}
		catch (Exception e){

		}
	}
}
