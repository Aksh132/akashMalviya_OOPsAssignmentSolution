package com.assignment.model;


//  HrDepartment Class extends in SuperDepartment Class

public class HrDepartment extends SuperDepartment {
	
	private String departmentName;
	private String todayWork;
	private String workDeadline;
	private String activity;
	
	
	public HrDepartment() {
		super();
		this.departmentName = " Hr Department ";
		this.todayWork = "Fill today’s worksheet and mark your attendance";
		this.workDeadline = "Complete by EOD";
		this.activity = "team Lunch";
	}
	
	public String departmentName() {
		
		return departmentName;
	}
	
	
   public String getTodaysWork() {
		
		return todayWork;
	}
   
   public String getWorkDeadline() {
		
		return workDeadline;
	}
	
   
   public String doActivity() {
		
		return activity;
	}
	
	
}
