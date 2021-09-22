package com.day4prgrams;

public class uc3empparttime {
	public static void main(String []args) {
	int is_part_time=1;
	int is_full_time=2;
	int emp_rate_perhour = 20;
	int emphrs =0;
	int empwage =0;
	double empcheck = Math.floor(Math.random() * 10) %3;
	if(empcheck == is_part_time)
		emphrs= 4;
	else if(empcheck ==is_full_time)
		emphrs = 8;
	else
		emphrs=0;
	empwage = emphrs * emp_rate_perhour;
	System.out.println("emp wage:" +empwage);
	
	}
}
