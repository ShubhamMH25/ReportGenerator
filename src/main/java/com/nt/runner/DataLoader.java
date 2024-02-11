package com.nt.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CitzenPlan;
import com.nt.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
	private CitizenPlanRepo repo;
	
	@Override
	public void run(ApplicationArguments args)throws Exception{
		
		repo.deleteAll();
		
		CitzenPlan c1=new CitzenPlan();
		c1.setCitizenName("Ram");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStrtDate(LocalDate.now().minusMonths(9));
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(20812.0);
		
		CitzenPlan c2=new CitzenPlan();
		c2.setCitizenName("Vaishnvi");
		c2.setGender("Female");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denide");
		c2.setPlanStrtDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenefitAmt(20812.0);
		c2.setDenialReason("Rental Income");
		
		CitzenPlan c3=new CitzenPlan();
		c3.setCitizenName("Sharad");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStrtDate(LocalDate.now().minusMonths(2));
		c3.setPlanEndDate(LocalDate.now().plusMonths(3));
		c3.setBenefitAmt(20812.0);
		c3.setTerminationDate(LocalDate.now().plusMonths(9));
		c3.setTerminationRes("Employed");
		
		CitzenPlan c4=new CitzenPlan();
		c4.setCitizenName("Mahi");
		c4.setGender("Female");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStrtDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(20812.0);
		
		CitzenPlan c5=new CitzenPlan();
		c5.setCitizenName("Shubham");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setPlanStrtDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenefitAmt(20812.0);
		c5.setDenialReason("Property Income");
		
		CitzenPlan c6=new CitzenPlan();
		c6.setCitizenName("Raghav");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStrtDate(LocalDate.now().minusDays(60));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(20812.0);
		c6.setTerminationDate(LocalDate.now().plusMonths(1));
		c6.setTerminationRes("Employed");
		
		CitzenPlan c7=new CitzenPlan();
		c7.setCitizenName("Chaitanya");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStrtDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(20812.0);
		
		CitzenPlan c8=new CitzenPlan();
		c8.setCitizenName("Rohit");
		c8.setGender("Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setPlanStrtDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmt(20812.0);
		c8.setDenialReason("Property Income");
		
		CitzenPlan c9=new CitzenPlan();
		c9.setCitizenName("Manav");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStrtDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(20812.0);
		c9.setTerminationDate(LocalDate.now().plusMonths(10));
		c9.setTerminationRes("Govt job");
		
		CitzenPlan c10=new CitzenPlan();
		c10.setCitizenName("Karan");
		c10.setGender("Male");
		c10.setPlanName("Cash");
		c10.setPlanStatus("Approved");
		c10.setPlanStrtDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(22));
		c10.setBenefitAmt(20812.0);
		
		CitzenPlan c11=new CitzenPlan();
		c11.setCitizenName("Ram");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Approved");
		c11.setPlanStrtDate(LocalDate.now().minusMonths(9));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmt(20812.0);
		
		CitzenPlan c21=new CitzenPlan();
		c21.setCitizenName("Vaishnv");
		c21.setGender("Male");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Denide");
		c21.setPlanStrtDate(LocalDate.now());
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmt(20812.0);
		c21.setDenialReason("Rental Income");
		
		CitzenPlan c13=new CitzenPlan();
		c13.setCitizenName("Sharada");
		c13.setGender("Female");
		c13.setPlanName("Employment");
		c13.setPlanStatus("Terminated");
		c13.setPlanStrtDate(LocalDate.now().minusMonths(2));
		c13.setPlanEndDate(LocalDate.now().plusMonths(3));
		c13.setBenefitAmt(20812.0);
		c13.setTerminationDate(LocalDate.now().plusMonths(9));
		c13.setTerminationRes("Employed");
		
		List<CitzenPlan> list=Arrays.asList(c11,c13,c4,c5,c6,c7,c8,c9,c10,c11,c21,c13);
		repo.saveAll(list);
	}
}
