package com.sakshi.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	

}
