package org.imaginea.requesttracking.util;

import org.imaginea.requesttracking.dto.Result;

public class BuildResponse {
	
	public static Result buildErrorMessage(String statusMessage) {
		
		Result result = new Result();
		result.setStatus(Constants.ERROR);
		result.setStatusMessage(statusMessage);
		return result;
		
	}
	
	public static Result buildSuccessMessage(Object data) {
		
		Result result = new Result();
		result.setStatus(Constants.SUCCESS);
		result.setData(data);
		return result;
		
	}

}
