package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

}
