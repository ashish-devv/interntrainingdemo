package com.ashish.interntrainingdemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String startdate;
	@Column(nullable = false)
	private String enddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Training(int id, String name, String startdate, String enddate) {
		super();
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	

}
