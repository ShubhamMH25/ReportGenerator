package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.CitzenPlan;
import com.nt.request.SearchRequest;
import com.nt.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@PostMapping("/search")
	public String handelSearch(@ModelAttribute("search") SearchRequest request, Model model) {
		List<CitzenPlan> plans=service.search(request);
		model.addAttribute("plans", plans);
		extracted(model); 
		return "index";
	}

	@GetMapping("/")
	public String indexPage(Model model)
	{
		model.addAttribute("search", new SearchRequest());
		
		extracted(model);
		return "index";
	}

	private void extracted(Model model) {
		
		
		model.addAttribute("names",service.getPlanNames());
		model.addAttribute("status",service.getPlanStatuses());
	}
	
	
	
}
