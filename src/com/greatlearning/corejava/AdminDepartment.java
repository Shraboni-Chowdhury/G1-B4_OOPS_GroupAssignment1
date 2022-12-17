package com.greatlearning.corejava;

//This department is Admin Department which is a sub class of Super Department

public class AdminDepartment extends SuperDepartment {
	
	String departmentName() {
		String d = " Admin Department ";
		return d;
	}
	
	String getTodaysWork() {
		String e = " Complete your documents submission ";
		return e;
	}
	
	String getWorkDeadline() {
		String f = " Complete by EOD ";
		return f;
	}

}
