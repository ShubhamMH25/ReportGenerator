package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.CitzenPlan;

public interface CitizenPlanRepo extends JpaRepository<CitzenPlan, Integer> {

	@Query("select distinct(planName)from CitzenPlan")
	public List<String> getPlanName();
	
	@Query("select distinct(planStatus)from CitzenPlan")
	public List<String> getPlanStatus();
}
