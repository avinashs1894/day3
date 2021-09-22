package com.day4prgrams;

public class uc2empfulltime {

	public static void main(String args[]) {
		int is_full_time = 1;
		int emp_rate_per_hour = 20;
		int emphrs = 0;
		int empwage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_full_time)
			emphrs = 8;
		empwage = emphrs * emp_rate_per_hour;
		System.out.println("emp wage: " + empwage);
		
	}
}
