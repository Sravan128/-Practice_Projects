package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FeedbackDao;
import com.example.demo.entity.FeedBack;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackDao feedbackdao;
	
	public boolean addFeedback( FeedBack f) {
		feedbackdao.save(f);
		return true;
	}
	
}
