package org.imaginea.requesttracking.exception;

@SuppressWarnings("serial")
public class CustomerServicePortalException extends RuntimeException {
		
		private String message;
		
		public CustomerServicePortalException(String message) {
			super(message);
			this.message = message;
		}
		
		public String getMessage() {
			return this.message;
		}
	
	
}

