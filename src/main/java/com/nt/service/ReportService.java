package com.nt.service;

import java.util.List;

import com.nt.entity.CitzenPlan;
import com.nt.request.SearchRequest;

public interface ReportService {
	
    //it Get the data from the table to display data in the droupdown
	//Plan Names Data
	public List<String> getPlanNames();
	//Plan Status Data
	public List<String> getPlanStatuses();
	
	public List<CitzenPlan> search(SearchRequest request);
	
	public Boolean exportExcel();
	
	public Boolean exportPdf();
}
