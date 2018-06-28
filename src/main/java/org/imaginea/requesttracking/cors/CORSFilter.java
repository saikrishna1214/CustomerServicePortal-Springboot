package org.imaginea.requesttracking.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class CORSFilter  extends GenericFilterBean implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Access-Control-Allow-Origin" , "*");
		httpResponse.setHeader("Access-Control-Allow-Methods" , "*");
		httpResponse.setHeader("Access-Control-Allow-Headers" , "*");
		httpResponse.setHeader("Access-Control-Allow-Credentials" , "false");
		httpResponse.setHeader("Access-Control-Max-Age" , "3600");
		chain.doFilter(request, response);
		
	}

}
