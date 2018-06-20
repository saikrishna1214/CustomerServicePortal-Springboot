package org.imaginea.requesttracking.dao;

import org.imaginea.requesttracking.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRequestDAO extends JpaRepository<ServiceRequest, Integer> {
	
	
}
