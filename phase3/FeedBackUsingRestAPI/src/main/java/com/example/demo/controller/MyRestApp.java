package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FeedBack;
import com.example.demo.service.FeedbackService;

@RestController
public class MyRestApp {

	
	@Autowired
	private FeedbackService service;

	@PostMapping("/feedback")
	public String userRegister( @RequestParam("email") String email , @RequestParam("feedback1") String feedback1) {
       FeedBack f =new FeedBack(email,feedback1);
	boolean data= service.addFeedback(f);
	if(data) {
		return "Feedback added succesfully!";
	}
	else {
		return "Unable to add the feedback";
	}
		
	}
}
