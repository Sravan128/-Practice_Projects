package com.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public class UserDao {
    @Autowired
    SessionFactory sf;
    
    public int storeUserDetails(User user) {
    	try {
			Session session=sf.openSession();
			Transaction trans=session.getTransaction();
			trans.begin();
			session.save(user);
			trans.commit();
			return 1;
			} 
    	catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
    }
    public User searchUserDetails(int uid) {
    
			Session session=sf.openSession();
			User u=session.get(User.class, uid);
			return u;
    	
    }
    public int updateUserDetails(User user) {
    	
			Session session=sf.openSession();
			Transaction trans=session.getTransaction();
			User u=session.get(User.class, user.getUid());
			if(u==null) {
				return 0;
			}
			else {
				
			trans.begin();
			u.setUname(user.getUname());
			u.setAddress(user.getAddress());
			session.update(u);
			trans.commit();
			return 1;
			} 

		}
		
    }
    
