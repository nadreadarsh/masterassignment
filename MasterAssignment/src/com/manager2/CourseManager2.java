package com.manager2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.bean.Academy;
import com.bean.Course;
import com.bean.Student;
import com.bean.Transaction;

public class CourseManager2 {
	public static ArrayList<Course> addCourse() {
		Course c1 = new Course(1, "DW", new Date(15 / 11 / 2023), "java", 40000, "2 months");
		Course c2 = new Course(2, "Angular", new Date(24 / 10 / 2023), "Adv java", 40000, "3 months");
		Course c3 = new Course(3, "Java", new Date(25 / 11 / 2023), "networking", 40000, "2 months");
		Course c4 = new Course(4, "Dot Net", new Date(12 / 10 / 2023), "java", 40000, "4 months");
		Course c5 = new Course(5, "Python", new Date(06 / 12 / 2023), "Matplotlib", 40000, "5 months");

		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
		Academy.courseList.add(c3);
		Academy.courseList.add(c4);
		Academy.courseList.add(c5);

		return Academy.courseList;
	}

	public static void printCourse() {

		Iterator<Course> itr = Academy.courseList.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	public static void feedetail() {
		Iterator<Course> itr = Academy.courseList.iterator();
		int sum = 0;
		ArrayList<Student> studentList5 = new ArrayList<>();

		Set<Entry<Integer, List<Transaction>>> set1 = Academy.transactionMap.entrySet();
		Iterator<Entry<Integer, List<Transaction>>> itr1 = set1.iterator();
		while (itr1.hasNext())
			System.out.println(itr1.next());
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr2 = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
