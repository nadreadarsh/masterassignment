package com.test;

import com.manager2.TestResultManager2;

import com.manager2.AttendanceManager2;
import com.manager2.CourseManager2;
import com.manager2.StudentManager2;
import com.manager2.TransactionManager2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Courses In the Academy As Follows:");
		CourseManager2.addCourse();
		CourseManager2.printCourse();
		
		System.out.println("Student In The Academy As Follows:");
		StudentManager2.addStudent();
		StudentManager2.printStudent();
		
		System.out.println("Student Attendance in the Academy As Follows:");
		AttendanceManager2.addAttendance();
		AttendanceManager2.printAttendance();
		
		System.out.println("Student Transaction in the Academy as Follows:");
		TransactionManager2.addTransaction();
		TransactionManager2.printTransaction();
		
		System.out.println("Student TestResult In the Academy As Follows:");
		TestResultManager2.addTestresult();
		TestResultManager2.printTestResult();
		
		System.out.println("Most Favoured course in the academy as follows:");
		StudentManager2.maxStudentfavcourse();
		
	}

}
