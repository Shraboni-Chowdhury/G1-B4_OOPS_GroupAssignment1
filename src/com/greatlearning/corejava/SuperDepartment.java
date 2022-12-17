package com.greatlearning.corejava;

//This Question Illustrates the Hierarchical Inheritance
//This Super Department is the super class of all departments

public class SuperDepartment {
	
	String departmentName() {
		String a = " Super Department ";
		return a;
	}
	
	String getTodaysWork() {
		String b = " No work today as of now ";
		return b;
	}
	
	String getWorkDeadline() {
		String c = " Nil ";
		return c;
	}
	
	String isTodayAHoliday() {
		String d= " Today is not a Holiday ";
		return d;
	}

}
