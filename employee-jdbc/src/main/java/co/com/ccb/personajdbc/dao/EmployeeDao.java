package co.com.ccb.personajdbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.ccb.personajdbc.model.Employee;

@Repository
public interface EmployeeDao {

	List<Employee> getAllEmployees();

    void insertEmployee(Employee employee);

}
