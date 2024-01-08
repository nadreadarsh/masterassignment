 package com.bean;




public class Attendance {
	public int att_sr_no;
	public int studId;
	public String att_status;
	 public MyDate Date;
	public Attendance(int att_sr_no, int att_sid, String att_status,MyDate Date) {
		this.att_sr_no = att_sr_no;
		this.studId = att_sid;
		this.att_status = att_status;
		this.Date=Date;
	
	}
	
	
	public String toString()
	{
		return("attendance srno:  "+this.att_sr_no+" "+"attendance sid:  "+this.studId+" "+"attendance status: "
	+this.att_status+" "+"attendance date: "+Date+"\n");
		
	}
	
	
}
