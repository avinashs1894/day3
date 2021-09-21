package com.day4prgrams;

public class uc5 {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rat_per_hour = 20;
	public static final int num_of_working_day=20;
	
	public static void main(String []args) {
		int emphrs = 0;
		int empwage = 0;
		int totalempwage =0;
		for ( int day=0; day<num_of_working_day; day++)
		{
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
		empwage = emphrs * emp_rat_per_hour;
		totalempwage += empwage;
		System.out.println("emp wage:" +empwage);	   
		}
		System.out.println("total emp wage: " + totalempwage);
	}

}
