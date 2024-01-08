package com.manager2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bean.Academy;
import com.bean.Student;

public class StudentManager2 {
	public static void addStudent() {
		ArrayList<Student> studentList1 = new ArrayList<>();

		Student s1 = new Student(101, "Abhishek", 921904221, "abhishek@gmail.com");
		Student s2 = new Student(102, "Sunish", 961938052, "sunish@gmail.com");
		Student s3 = new Student(103, "Bhakti", 911249760, "bhakti@gmail.com");
//		Student s4 = new Student(104, "Adarsh", 706664640, "adarsh@gmail.com");
//		Student s5 = new Student(105, "Prashant", 749818438, "prashant@gmail.com");

		studentList1.add(s1);
		studentList1.add(s2);
		studentList1.add(s3);
//		studentList1.add(s4);
//		studentList1.add(s5);
		Academy.studentMap.put(1, studentList1);

		ArrayList<Student> studentList2 = new ArrayList<>();
		Student s6 = new Student(106, "Utkarsha", 961984815, "utkarsha@gmail.com");
		Student s7 = new Student(107, "maroti", 961255166, "maroti@gmail.com");
		Student s8 = new Student(108, "suraj", 84619720, "suraj@gmail.com");
//		Student s9 = new Student(109, "Aadarsh", 716179260, "aadarsh@gmail.com");
		Student s10 = new Student(110, "pritam", 749268938, "pritam@gmail.com");
		studentList2.add(s6);
		studentList2.add(s7);
		studentList2.add(s8);
//		studentList2.add(s9);
		studentList2.add(s10);
		Academy.studentMap.put(2, studentList2);

		ArrayList<Student> studentList3 = new ArrayList<>();
		Student s11 = new Student(111, "Ganesh", 984561221, "ganesh@gmail.com");
//		Student s12 = new Student(112, "Amit", 964978162, "amit@gmail.com");
//		Student s13 = new Student(113, "Ulka", 914919760, "ulka@gmail.com");
//		Student s14 = new Student(114, "Harshal", 774985640, "harshal@gmail.com");
		Student s15 = new Student(115, "Nishant", 748719658, "nishant@gmail.com");
		studentList3.add(s11);
//		studentList3.add(s12);
//		studentList3.add(s13);
//		studentList3.add(s14);
		studentList3.add(s15);
		Academy.studentMap.put(3, studentList3);

		ArrayList<Student> studentList4 = new ArrayList<>();
//		Student s16 = new Student(116, "Suraj", 784616431, "pawar@gmail.com");
//		Student s17 = new Student(117, "Prabhakar", 684163489, "prabhakar@gmail.com");
		Student s18 = new Student(118, "Shubhangi", 971551880, "shubhangi@gmail.com");
		Student s19 = new Student(119, "Snehal", 704941680, "snehal@gmail.com");
		Student s20 = new Student(120, "Prasad", 749478916, "prasad@gmail.com");
//		studentList4.add(s16);
//		studentList4.add(s17);
		studentList4.add(s18);
		studentList4.add(s19);
		studentList4.add(s20);
		Academy.studentMap.put(4, studentList4);

		ArrayList<Student> studentList5 = new ArrayList<>();
		Student s21 = new Student(121, "Shraadha", 982430254, "shraadha@gmail.com");
		Student s22 = new Student(122, "Vidya", 862496587, "vidya@gmail.com");
//		Student s23 = new Student(123, "Nisha", 914975047, "nisha@gmail.com");
//		Student s24 = new Student(124, "Rohini", 869571269, "rohini@gmail.com");
//		Student s25 = new Student(125, "Pooja", 768542398, "pooja@gmail.com");
		studentList5.add(s21);
		studentList5.add(s22);
//		studentList5.add(s23);
//		studentList5.add(s24);
//		studentList5.add(s25);
		Academy.studentMap.put(5, studentList5);
	}

	public static void printStudent() {
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

	// most favoured course by student in collections
	public static void maxStudentfavcourse() {
		int max = 0;
		Set<Entry<Integer, List<Student>>> set = Academy.studentMap.entrySet();
		Iterator<Entry<Integer, List<Student>>> itr1 = set.iterator();
		int fav = 0;
		while (itr1.hasNext()) {
			Entry<Integer, List<Student>> s = itr1.next();
			int size = s.getValue().size();
			if (max < size) {
				max = size;
				fav = s.getKey();
			}
		}
		System.out.println("Course ID " + fav + " Is the most favourable course by students: " + max);
	}

}

// find our students who paid all fees, use LinkedHashMap in order to find out
// those
//	first 3 students across courses who paid full fees ( note student can pay fee in part 
// installment or one time as well)
/*
 * public static double calculateTotalFee() { return 40000; }
 * 
 * 
 * public static void paidfee() { Set<Entry<Integer,List<Student>>> set1 =
 * Academy.studentMap.entrySet(); Iterator<Entry<Integer,List<Student>>> itr2 =
 * set1.iterator(); int sum = 0; while(itr2.hasNext()) {
 * Entry<Integer,List<Student>> s1 = itr2.next();
 * 
 * }
 * 
 * 
 * }
 * 
 * 
 */
