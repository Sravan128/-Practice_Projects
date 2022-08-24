package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id 
  private int uid;
  private String uname;
  private String martial_status;
  private String address;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getMartial_status() {
	return martial_status;
}
public void setMartial_status(String martial_status) {
	this.martial_status = martial_status;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", martial_status=" + martial_status + ", address=" + address + "]";
}
  
}
