package com.assignment.main;

import com.assignment.model.AdminDepartment;
import com.assignment.model.HrDepartment;
import com.assignment.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		
		// Objects for All department
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		
		// for Admin Department
		
		System.out.println("Welcome to" + admin.departmentName());
		System.out.println(admin.getTodayWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		 System.out.println();
		
		
		
		// for hr Department
		
				System.out.println("Welcome to" + hr.departmentName());
				System.out.println(hr.doActivity());
				System.out.println(hr.getTodaysWork());
				System.out.println(hr.getWorkDeadline());
				System.out.println(hr.isTodayAHoliday());
				 System.out.println();
				
				
				
				
	   // for Tech Department
				
				System.out.println("Welcome to " + tech.DepartmentName());
				System.out.println(tech.getTodaysWork());
				System.out.println(tech.getWorkDeadline());
				System.out.println(tech.getTechStackInformation());
				System.out.println(tech.isTodayAHoliday());
				 System.out.println();
				
				
				
	
				
	}

}
