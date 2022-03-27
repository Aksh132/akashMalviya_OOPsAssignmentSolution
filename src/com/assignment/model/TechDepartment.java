package com.assignment.model;


//  TechDepartment Class extends in SuperDepartment Class

public class TechDepartment extends SuperDepartment {
	
	private String departmentName;
	private String todayWork;
	private String workDeadline;
	private String techStackInformation;
	
	
	public TechDepartment() {
		super();
		this.departmentName = "Tech Department";
		this.todayWork = "Complete coding of module 1";
		this.workDeadline = "Complete by EOD";
		this.techStackInformation = "core Java";
	}
	
	
	
	public String DepartmentName() {
		return departmentName;
	}
	
	
	
	public String getTodaysWork() {
		return todayWork;
	}
	
	
	
	public String getWorkDeadline() {
		return workDeadline;
	}
	
	
	public String getTechStackInformation() {
		return techStackInformation;
	}
	
	

}
