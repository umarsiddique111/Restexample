package com.restexample.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.resteample.model.*;

@Controller
public class EmployeeController {
//	Employee employee = new Employee();
    @RequestMapping("/contact/{id}")
    @ResponseBody
    public Employee employee(@PathVariable("id") Integer id) {
        // mimics a call to a business service
        return new Employee("ali","ali1234",id);
    }
 
}



//@Controller
//@RequestMapping("employees")
//public class EmployeeController {
//	
//    Employee employee = new Employee();
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
//    public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name) {
//       employee.setName(name);
//       employee.setpassword("12345");
//    return employee; 
//    }
//    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
//    public @ResponseBody Employee getEmployeeInXML(@PathVariable String name) {
//       employee.setName(name);
//     employee.setpassword("12345");
//       return employee; 
//    }
//}