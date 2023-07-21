package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.entity.Employee;


@Controller
@ResponseBody
public class EmployeeController
{
	


	@GetMapping("/employee/{id}/{firstName}/{lastName}")
public Employee getEmployee(@PathVariable int id, @PathVariable String firstName, @PathVariable String lastName)
{
	

	return new Employee(id,firstName,lastName);
}
	
	

@GetMapping("/employeeList/employees/{id1}/{id2}/{id3}/{id4}")
public List<Employee> getEmployees(@PathVariable int id1, @PathVariable int id2,@PathVariable  int id3, 
		@PathVariable int id4)
		
{
	
	List<Employee>employeeList=new ArrayList();
	Employee employee1=new Employee(id1,"Priyanka","Shinde");
	Employee employee2=new Employee(id2,"Rachana","Vare");
	Employee employee3=new Employee(id3,"Payal","Phapale");
	Employee employee4=new Employee(id4,"Kishori","Bhalerao");
	
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	employeeList.add(employee4);;
	
	return employeeList;
	
}

@GetMapping("employee/request")
public Employee employeeRequestParam(@RequestParam int id, @RequestParam String firstName,
		@RequestParam String lastName) 
{
	return new Employee (id, firstName,lastName);
	
}


@PostMapping("/employee/create")
@ResponseStatus(HttpStatus.CREATED)
public Employee createEmployee(@RequestBody Employee employee)
{
	System.out.println(employee.getId());
	System.out.println(employee.getFirstName());
	System.out.println(employee.getLastName());

	return employee;
}

@PutMapping("/employee/update")
public Employee updateEmployee(@RequestBody Employee employee) 
{
	Employee e1=new Employee(15,"Sudarshan","Bhalerao");
	
	e1.setId(employee.getId());
	e1.setFirstName(employee.getFirstName());
	e1.setLastName(employee.getLastName());
	
	return e1;
}

@GetMapping("employee/response/list")
public ResponseEntity<List<Employee>>employeeResponse()
{
	List<Employee> employeeList = new ArrayList<>();
	
	Employee e1=new Employee(5,"Kavya","Dubey");
	Employee e2=new Employee(10,"Payal","Phapale");
	Employee e3=new Employee(15,"Avantika","Thube");
	Employee e4=new Employee(20,"Gauri","Shinde");
	
	employeeList.add(e1);
	employeeList.add(e2);
	employeeList.add(e3);
	employeeList.add(e4);
	
	
	return new ResponseEntity<>(employeeList, HttpStatus.OK);
}

@DeleteMapping("employee/delete/{id}")
public String deleteEmployee(@PathVariable int id)
{
	System.out.println("Employee with id:"+id+" deleted successfully...!");
	return "Employee Deleted Successfully...!";
}
}


