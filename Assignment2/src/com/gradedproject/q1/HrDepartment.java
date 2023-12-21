package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {
	
	 public String departmentName() {
	        return "HR Department";
	    }

	    @Override
	    public String getTodaysWork() {
	        return "Complete your documents Submission";
	    }

	    @Override
	    public String getWorkDeadline() {
	        return "Complete by EOD";
	    }

	    public String doActivity() {
	        return "Team Lunch";
	    }

}
