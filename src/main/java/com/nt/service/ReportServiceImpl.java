package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.entity.CitzenPlan;
import com.nt.repo.CitizenPlanRepo;
import com.nt.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepo repo;
	
	@Override
	public List<String> getPlanNames() {
		return repo.getPlanName();
		 
	}

	@Override
	public List<String> getPlanStatuses() {
		return repo.getPlanStatus();
		
	}

	@Override
	public List<CitzenPlan> search(SearchRequest request) {
		CitzenPlan entity=new CitzenPlan();
		if(null !=request.getPlanName() && !"".equals(request.getPlanName()))
		{
			entity.setPlanName(request.getPlanName());
		}
		if(null !=request.getPlanStatus() && !"".equals(request.getPlanStatus()))
		{
			entity.setPlanStatus(request.getPlanStatus());
		}
		if(null !=request.getGender() && !"".equals(request.getGender()))
		{
			entity.setGender(request.getGender());
		}
		return repo.findAll(Example.of(entity));
		
	}

	@Override
	public Boolean exportExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportPdf() {
		// TODO Auto-generated method stub
		return null;
	}

}
