package com.assignment.model;


// All Classes Of model Package Extends In SuperDepartment Class

public class SuperDepartment {
	
	private String departmentName;
	private String todayWork;
	private String workDeadline;
	private String holiday;
	
	
	public SuperDepartment() {
		super();
		this.departmentName = " Super Department ";
		this.todayWork =  "No Work as of now";
		this.workDeadline = "Nil";
		this.holiday = "Today is not a Holiday";
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
	
   
   public String isTodayAHoliday() {
		
		return holiday;
	}
	

	
	
	
	
	}





