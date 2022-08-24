package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {
@Autowired
UserService userservice;
@RequestMapping(value="storeUser" ,method=RequestMethod.POST)
public ModelAndView storeUser(HttpServletRequest req, User user ) {
	int uid=Integer.parseInt(req.getParameter("id"));
	String uname=req.getParameter("name");
	String martial_status=req.getParameter("status");
	String address=req.getParameter("address");
	
	
	user.setUid(uid);
	user.setUname(uname);
	user.setMartial_status(martial_status);
	user.setAddress(address);
	
	String result=userservice.StoreUser(user);
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg",result);
	mav.setViewName("storeuser.jsp");
         return mav;
}
@RequestMapping(value="updateUser" ,method=RequestMethod.POST)
public ModelAndView updateUser(HttpServletRequest req, User user ) {
	int uid=Integer.parseInt(req.getParameter("id"));
	String uname=req.getParameter("name");
	String address=req.getParameter("address");
	user.setUid(uid);
	user.setUname(uname);
	user.setAddress(address);
	
	String result=userservice.UpdateUser(user);
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg",result);
	mav.setViewName("updateuser.jsp");
         return mav;
}
@RequestMapping(value="searchUser" ,method=RequestMethod.POST)
public ModelAndView searchUser(HttpServletRequest req, User user ) {
	int uid=Integer.parseInt(req.getParameter("id"));
	
	String result=userservice.SearchUser(uid);
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg",result);
	mav.setViewName("searchuser.jsp");
         return mav;
}
}
