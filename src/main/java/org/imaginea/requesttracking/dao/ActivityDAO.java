package org.imaginea.requesttracking.dao;

import java.util.List;

import org.imaginea.requesttracking.entity.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityDAO extends JpaRepository<Activities, Integer> {
		
		public List<Activities> getActivitiesBysrNumber(int srNumber);
}
