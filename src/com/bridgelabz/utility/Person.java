package com.bridgelabz.utility;

public class Person {
    
	private String firstname;
	private String lastname;
	private Address addr=new Address();
	private long phonenumber;
	public Person()
	{
		firstname=null;
		lastname=null;
		addr=null;
		phonenumber=0;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
