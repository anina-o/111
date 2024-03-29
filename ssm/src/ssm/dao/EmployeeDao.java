package ssm.dao;

import java.util.List;

import ssm.entity.Employee;

public interface EmployeeDao {
	
	int insertEmployee(Employee employee);
	
	int getCntByUsername(String username);
	
	List<Employee> getEmployees();
}
