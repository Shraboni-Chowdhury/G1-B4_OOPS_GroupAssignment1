package com.greatlearning.corejava;

// This department is Tech Department which is the sub class of Super Department

public class TechDepartment extends SuperDepartment {
	
	String departmentName() {
		String k = " Tech Department ";
		return k;
	}
	
	String getTodaysWork() {
		String l = " Complete coding of module 1";
		return l;
	}
	
	String getWorkDeadline() {
		String m = " Complete by EOD ";
		return m;
	}
	
	String getTechStackInformation() {
		String n = " Core Java ";
		return n;
	}

}
