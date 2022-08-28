package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class FeedBack {

	
	

	@Id @GeneratedValue
	private int id;
	private String email;
	private String feedback1;
	

	
	
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}




	public FeedBack(String email, String feedback1) {
		super();
		this.email = email;
		this.feedback1 = feedback1;
	}




	@Override
	public String toString() {
		return "Feedback [id=" + id + ", email=" + email
				+ ", feedback1=" + feedback1 + "]";
	}
	
}
