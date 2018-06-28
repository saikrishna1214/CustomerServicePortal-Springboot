package org.imaginea.requesttracking;

import org.imaginea.requesttracking.cors.CORSFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CustomerServicePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServicePortalApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean corsFilter() {
		
		FilterRegistrationBean filterregestratinBean = new FilterRegistrationBean(new CORSFilter());
		filterregestratinBean.setName("CORS Filter");
		filterregestratinBean.addUrlPatterns("/*");
		filterregestratinBean.setOrder(1);
		return filterregestratinBean;
	}
}
