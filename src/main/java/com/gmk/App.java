package com.gmk;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmk.Json.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException {
        
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(new File("src/main/resources/Employee.json"),Employee.class);
        
        System.out.println("employee object -> "+employee);
        
       List<Employee> employeeList =  mapper.readValue(new File("src/main/resources/EmployeeList.json"),new TypeReference<List<Employee>>() {});
       System.out.println("Employee List ->"+employeeList);
    
 Employee[] employeeList1 =  mapper.readValue(new File("src/main/resources/Employee.json"),Employee[].class);
      for(Employee emp1 : employeeList1) {
    	  System.out.println("JSon file created"+emp1);
      }
    }
}
