/*package org.imaginea.requesttracking.controller;

import org.imaginea.requesttracking.entity.Employee;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeLoginController {

	@RequestMapping(value = "/employeeLogin" , method = RequestMethod.POST)
	public Result validateEmployeeLogin(@RequestBody Employee employee) {
		
		return BuildResponse.buildSuccessMessage(employeeService.validateLogin(employee));
	}
}
*/