package com.sakshi.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class student //POJO
{
	@Id
	private int sid;
	private String sname;
	private String scolor;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScolor() {
		return scolor;
	}
	public void setScolor(String scolor) {
		this.scolor = scolor;
	}
	
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", scolor=" + scolor + "]";
	}
	
	

}
