package co.com.ccb.personajdbc.service;

import java.util.List;

import co.com.ccb.personajdbc.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}
