package com.manager2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.bean.Transaction;
import com.bean.Academy;
import com.bean.Attendance;
import com.bean.MyDate;

public class TransactionManager2 {
	public static void addTransaction() {
		ArrayList<Transaction> transactionList1 = new ArrayList<>();
		Transaction t1 = new Transaction(20000, 101, new MyDate(01, 12, 2023));
		Transaction t2 = new Transaction(25000, 102, new MyDate(01, 12, 2023));
		Transaction t3 = new Transaction(40000, 103, new MyDate(01, 12, 2023));
		Transaction t4 = new Transaction(30000, 104, new MyDate(01, 12, 2023));
		Transaction t5 = new Transaction(10000, 105, new MyDate(01, 12, 2023));
		transactionList1.add(t1);
		transactionList1.add(t2);
		transactionList1.add(t3);
		transactionList1.add(t4);
		transactionList1.add(t5);

		Academy.transactionMap.put(1, transactionList1);

		ArrayList<Transaction> transactionList2 = new ArrayList<>();
		Transaction t6 = new Transaction(20500, 106, new MyDate(01, 12, 2023));
		Transaction t7 = new Transaction(25000, 107, new MyDate(01, 12, 2023));
		Transaction t8 = new Transaction(35000, 108, new MyDate(01, 12, 2023));
		Transaction t9 = new Transaction(40000, 109, new MyDate(01, 12, 2023));
		Transaction t10 = new Transaction(15000, 110, new MyDate(01, 12, 2023));
		transactionList2.add(t6);
		transactionList2.add(t7);
		transactionList2.add(t8);
		transactionList2.add(t9);
		transactionList2.add(t10);

		Academy.transactionMap.put(2, transactionList2);

		ArrayList<Transaction> transactionList3 = new ArrayList<>();
		Transaction t11 = new Transaction(28000, 111, new MyDate(01, 12, 2023));
		Transaction t12 = new Transaction(26500, 112, new MyDate(01, 12, 2023));
		Transaction t13 = new Transaction(40000, 113, new MyDate(01, 12, 2023));
		Transaction t14 = new Transaction(28500, 114, new MyDate(01, 12, 2023));
		Transaction t15 = new Transaction(22500, 115, new MyDate(01, 12, 2023));
		transactionList3.add(t11);
		transactionList3.add(t12);
		transactionList3.add(t13);
		transactionList3.add(t14);
		transactionList3.add(t15);

		Academy.transactionMap.put(3, transactionList3);

		ArrayList<Transaction> transactionList4 = new ArrayList<>();
		Transaction t16 = new Transaction(30000, 116, new MyDate(01, 12, 2023));
		Transaction t17 = new Transaction(32500, 117, new MyDate(01, 12, 2023));
		Transaction t18 = new Transaction(20500, 118, new MyDate(01, 12, 2023));
		Transaction t19 = new Transaction(28500, 119, new MyDate(01, 12, 2023));
		Transaction t20 = new Transaction(35500, 120, new MyDate(01, 12, 2023));
		transactionList4.add(t16);
		transactionList4.add(t17);
		transactionList4.add(t18);
		transactionList4.add(t19);
		transactionList4.add(t20);

		Academy.transactionMap.put(4, transactionList4);

		ArrayList<Transaction> transactionList5 = new ArrayList<>();
		Transaction t21 = new Transaction(20500, 121, new MyDate(01, 12, 2023));
		Transaction t22 = new Transaction(19500, 122, new MyDate(01, 12, 2023));
		Transaction t23 = new Transaction(20500, 123, new MyDate(01, 12, 2023));
		Transaction t24 = new Transaction(28500, 124, new MyDate(01, 12, 2023));
		Transaction t25 = new Transaction(15500, 125, new MyDate(01, 12, 2023));
		transactionList5.add(t21);
		transactionList5.add(t22);
		transactionList5.add(t23);
		transactionList5.add(t24);
		transactionList5.add(t25);

		Academy.transactionMap.put(5, transactionList5);

	}

	public static void printTransaction() {
		Set<Entry<Integer, List<Transaction>>> set = Academy.transactionMap.entrySet();
		Iterator<Entry<Integer, List<Transaction>>> itr = set.iterator();
		while (itr.hasNext())

			System.out.println(itr.next());

	}

}
