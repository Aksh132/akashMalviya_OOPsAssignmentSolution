package com.assignment.model;


// AdminDepartment Class extends in SuperDepartment Class

public class AdminDepartment extends SuperDepartment {
	
	private String departmentName;
	private String todayWork;
	private String workDeadline;
	
	
	
	public AdminDepartment() {
		super();
		this.departmentName = " Admin Department ";
		this.todayWork = "Complete your documents Submission";
		this.workDeadline = "Complete by EOD";
		
	}
	
	public String departmentName() {
		
		
		return departmentName;
	}
	
	
   public String getTodayWork() {
		
		return todayWork;
	}
   
   public String getWorkDeadline() {
		
		return workDeadline;
	}
	
	
	
}
