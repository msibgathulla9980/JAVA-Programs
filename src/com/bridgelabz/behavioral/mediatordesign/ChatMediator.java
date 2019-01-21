package com.bridgelabz.behavioral.mediatordesign;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}