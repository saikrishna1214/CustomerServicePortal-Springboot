package org.imaginea.requesttracking.controller;

import org.imaginea.requesttracking.dto.Result;
import org.imaginea.requesttracking.exception.CustomerServicePortalException;
import org.imaginea.requesttracking.util.BuildResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(CustomerServicePortalException.class)
	@ResponseBody
	public Result ErrorHandler(CustomerServicePortalException customerServicePortalException) {
		
			return BuildResponse.buildErrorMessage(customerServicePortalException.getMessage());
	}
}