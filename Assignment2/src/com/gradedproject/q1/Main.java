package com.gradedproject.q1;

public class Main {
	
	 public static void main(String[] args) {
	       
	        SuperDepartment superDept = new SuperDepartment();
	        AdminDepartment adminDept = new AdminDepartment();
	        HrDepartment hrDept = new HrDepartment();
	        TechDepartment techDept = new TechDepartment();

	     
	        displayFunctionalities(superDept);
	        displayFunctionalities(adminDept);
	        displayFunctionalities(hrDept);
	        displayFunctionalities(techDept);

	
	        System.out.println(superDept.isTodayAHoliday());
	    }

	  
	    public static void displayFunctionalities(SuperDepartment department) {
	        System.out.println("Department Name: " + department.departmentName());
	        System.out.println("Today's Work: " + department.getTodaysWork());
	        System.out.println("Work Deadline: " + department.getWorkDeadline());
	        System.out.println("Is Today a Holiday: " + department.isTodayAHoliday());
	        System.out.println();
	    }

}
