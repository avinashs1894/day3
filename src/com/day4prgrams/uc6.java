package com.day4prgrams;

public class uc6 {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rat_per_hour = 20;
	public static final int num_of_working_day=20;
	public static final int max_hrs_in_month = 100; 
	
	public static void main(String []args) {
		int emphrs = 0;
		int empwage = 0;
		int totalempwage =0;
		int totalemphrs = 0;
		int totalworkingdays = 0;
		while (totalemphrs <= max_hrs_in_month && totalworkingdays < num_of_working_day)
		{
			totalworkingdays++;
		int empcheck = (int) Math.floor(Math.random() * 10) %3;
		switch (empcheck) {
		case is_part_time:
			emphrs=4;
			break;
		case is_full_time:
			emphrs=8;
			break;
		default:
			emphrs = 0;
	}
		totalemphrs += emphrs;
		System.out.println("emp wage:" +empwage);	   
		}
		totalempwage = totalemphrs * emp_rat_per_hour;
		System.out.println("total emp wage: " + totalempwage);
	}

}
	