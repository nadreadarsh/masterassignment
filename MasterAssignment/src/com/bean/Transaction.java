package com.bean;



public class Transaction {
	public int paidfees; // 1st entry 10k stud1 d1, 5k stud2 d2, 5k stud2 d3
	public int studId;
	public MyDate Date;

	public Transaction(int paidfees, int trans_studentId, MyDate date) {
		this.paidfees = paidfees;
		this.studId = trans_studentId;
		this.Date=date;

	}

	public String toString() {
		return ("paid fees:  " + this.paidfees + " " + "transaction sid:  " + this.studId + " "
				+ "transaction date: " + this.Date + "\n");

	}

}
