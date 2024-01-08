package com.manager2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import com.bean.Academy;
import com.bean.Attendance;
import com.bean.MyDate;


public class AttendanceManager2 {

	public static void addAttendance() {
		ArrayList<Attendance> attendanceList = new ArrayList<>();
		Attendance a = new Attendance(1, 101, "Absent",new MyDate(06, 12, 2023));
		Attendance a1 = new Attendance(2, 102, "Present", new MyDate(06, 12, 2023));
		Attendance a2 = new Attendance(3, 103, "Present", new MyDate(06, 12, 2023));
		Attendance a3 = new Attendance(4, 104, "Absent", new MyDate(06, 12, 2023));
		Attendance a4 = new Attendance(5, 105, "Present", new MyDate(06, 12, 2023));
		attendanceList.add(a);
		attendanceList.add(a1);
		attendanceList.add(a2);
		attendanceList.add(a3);
		attendanceList.add(a4);

		Academy.attendanceMap.put(1, attendanceList);

		ArrayList<Attendance> attendanceList1 = new ArrayList<>();
		Attendance a5 = new Attendance(6, 106, "Present", new MyDate(07, 12, 2023));
		Attendance a6 = new Attendance(7, 107, "Present", new MyDate(21, 12, 2023));
		Attendance a7 = new Attendance(8, 108, "Absent", new MyDate(22, 12, 2023));
		Attendance a8 = new Attendance(9, 109, "Present", new MyDate(28, 12, 2023));
		Attendance a9 = new Attendance(10, 110, "Present", new MyDate(4, 12, 2023));
		attendanceList1.add(a5);
		attendanceList1.add(a6);
		attendanceList1.add(a7);
		attendanceList1.add(a8);
		attendanceList1.add(a9);
		Academy.attendanceMap.put(2, attendanceList1);

		ArrayList<Attendance> attendanceList2 = new ArrayList<>();
		Attendance a10 = new Attendance(11, 111, "Present", new MyDate(6, 12, 2023));
		Attendance a11 = new Attendance(12, 112, "Absent", new MyDate(26, 12, 2023));
		Attendance a12 = new Attendance(13, 113, "Present", new MyDate(05, 12, 2023));
		Attendance a13 = new Attendance(14, 114, "Present", new MyDate(11, 12, 2023));
		Attendance a14 = new Attendance(15, 115, "Absent", new MyDate(18, 12, 2023));
		attendanceList2.add(a10);
		attendanceList2.add(a11);
		attendanceList2.add(a12);
		attendanceList2.add(a13);
		attendanceList2.add(a14);
		Academy.attendanceMap.put(3, attendanceList2);

		ArrayList<Attendance> attendanceList3 = new ArrayList<>();
		Attendance a15 = new Attendance(16, 116, "Present", new MyDate(10, 12, 2023));
		Attendance a16 = new Attendance(17, 117, "Present", new MyDate(1, 12, 2023));
		Attendance a17 = new Attendance(18, 118, "Absent", new MyDate(07, 12, 2023));
		Attendance a18 = new Attendance(19, 119, "Present", new MyDate(18, 12, 2023));
		Attendance a19 = new Attendance(20, 120, "Absent", new MyDate(19, 12, 2023));
		attendanceList3.add(a15);
		attendanceList3.add(a16);
		attendanceList3.add(a17);
		attendanceList3.add(a18);
		attendanceList3.add(a19);
		Academy.attendanceMap.put(4, attendanceList3);

		ArrayList<Attendance> attendanceList4 = new ArrayList<>();
		Attendance a20 = new Attendance(21, 121, "Present", new MyDate(29, 12, 2023));
		Attendance a21 = new Attendance(22, 122, "Present", new MyDate(20, 12, 2023));
		Attendance a22 = new Attendance(23, 123, "Present", new MyDate(27, 12, 2023));
		Attendance a23 = new Attendance(24, 124, "Absent", new MyDate(30, 12, 2023));
		Attendance a24 = new Attendance(25, 125, "Present", new MyDate(03, 12, 2023));

		attendanceList4.add(a20);
		attendanceList4.add(a21);
		attendanceList4.add(a22);
		attendanceList4.add(a23);
		attendanceList4.add(a24);
		Academy.attendanceMap.put(5, attendanceList4);

	}

	public static void printAttendance() {
		Set<Entry<Integer, List<Attendance>>> set = Academy.attendanceMap.entrySet();
		Iterator<Entry<Integer, List<Attendance>>> itr = set.iterator();
		while (itr.hasNext())
			
			System.out.println(itr.next());

	}

}
