package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FeedBack;

@Repository
public interface FeedbackDao extends CrudRepository<FeedBack, Integer>{

}
