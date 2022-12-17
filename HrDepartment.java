package com.greatlearning.corejava;

// This department is Hr Department which is a sub class of Super Department

public class HrDepartment extends SuperDepartment {
	
	String departmentName() {
		String g = " Hr Department ";
		return g;
	}
	
	String getTodaysWork() {
		String h = " Fill today's timesheet and mark your attendence";
		return h;
	}
	
	String getWorkDeadline() {
		String i = " Complete by EOD ";
		return i;
	}
	
	String doActivity() {
		String j = " team Lunch ";
		return j;
	}


}
