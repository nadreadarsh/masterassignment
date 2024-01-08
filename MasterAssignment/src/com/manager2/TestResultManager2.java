package com.manager2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bean.Academy;
import com.bean.MyDate;
import com.bean.TestResult;

public class TestResultManager2 {
	public static void addTestresult() {
	ArrayList<TestResult>testresultList1=new ArrayList<>();
	TestResult r1=new TestResult(new MyDate(10,11,2023),201,101,85,100);
	TestResult r2=new TestResult(new MyDate(10,11,2023),201,102,88,100);
	TestResult r3=new TestResult(new MyDate(10,11,2023),201,103,95,100);
	TestResult r4=new TestResult(new MyDate(10,11,2023),201,104,65,100);
	TestResult r5=new TestResult(new MyDate(10,11,2023),201,105,75,100);
	testresultList1.add(r1);
	testresultList1.add(r2);
	testresultList1.add(r3);
	testresultList1.add(r4);
	testresultList1.add(r5);
	
	
	Academy.test_map.put(1, testresultList1);
	
	ArrayList<TestResult>testresultList2=new ArrayList<>();
	TestResult r6=new TestResult(new MyDate(10,11,2023),202,106,88,100);
	TestResult r7=new TestResult(new MyDate(10,11,2023),202,107,95,100);
	TestResult r8=new TestResult(new MyDate(10,11,2023),202,108,75,100);
	TestResult r9=new TestResult(new MyDate(10,11,2023),202,109,66,100);
	TestResult r10=new TestResult(new MyDate(10,11,2023),202,110,85,100);
	testresultList2.add(r6);
	testresultList2.add(r7);
	testresultList2.add(r8);
	testresultList2.add(r9);
	testresultList2.add(r10);
	
	Academy.test_map.put(2, testresultList2);
	
	ArrayList<TestResult>testresultList3=new ArrayList<>();
	TestResult r11=new TestResult(new MyDate(10,11,2023),203,111,85,100);
	TestResult r12=new TestResult(new MyDate(10,11,2023),203,112,78,100);
	TestResult r13=new TestResult(new MyDate(10,11,2023),203,113,65,100);
	TestResult r14=new TestResult(new MyDate(10,11,2023),203,114,68,100);
	TestResult r15=new TestResult(new MyDate(10,11,2023),203,115,65,100);
	testresultList3.add(r11);
	testresultList3.add(r12);
	testresultList3.add(r13);
	testresultList3.add(r14);
	testresultList3.add(r15);
	
	Academy.test_map.put(3, testresultList3);
	
	ArrayList<TestResult>testresultList4=new ArrayList<>();
	TestResult r16=new TestResult(new MyDate(10,11,2023),204,116,75,100);
	TestResult r17=new TestResult(new MyDate(10,11,2023),204,117,68,100);
	TestResult r18=new TestResult(new MyDate(10,11,2023),204,118,45,100);
	TestResult r19=new TestResult(new MyDate(10,11,2023),204,119,65,100);
	TestResult r20=new TestResult(new MyDate(10,11,2023),204,120,55,100);
	testresultList4.add(r16);
	testresultList4.add(r17);
	testresultList4.add(r18);
	testresultList4.add(r19);
	testresultList4.add(r20);
	
	Academy.test_map.put(4, testresultList4);
	
	ArrayList<TestResult>testresultList5=new ArrayList<>();
	TestResult r21=new TestResult(new MyDate(10,11,2023),205,121,85,100);
	TestResult r22=new TestResult(new MyDate(10,11,2023),205,122,89,100);
	TestResult r23=new TestResult(new MyDate(10,11,2023),205,123,88,100);
	TestResult r24=new TestResult(new MyDate(10,11,2023),205,124,98,100);
	TestResult r25=new TestResult(new MyDate(10,11,2023),205,125,95,100);
	testresultList5.add(r21);
	testresultList5.add(r22);
	testresultList5.add(r23);
	testresultList5.add(r24);
	testresultList5.add(r25);
	
	
	Academy.test_map.put(5, testresultList5);
	
	
	}
	public static void printTestResult() {
		Set<Entry<Integer,List<TestResult>>>set=Academy.test_map.entrySet();
		Iterator<Entry<Integer,List<TestResult>>>itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
//	public static void poorPerformance() {
//	// show poor performing students (marks <40%) across all tests for a course id.
//	boolean ispoorperformance=true;
//	 for(Map.Entry<Integer, List<TestResult>>entry:Academy.test_map.entrySet()) {
//		 System.out.println("Key: "+entry.getKey()+"Values: "+entry.getValue());
//		 if(entry.getKey().equals(entry)&& entry.getValue() >= 40.0)
//		
//		 
//		 
//	 }
			
			
		
		
	
		
//	}
	
	

}
