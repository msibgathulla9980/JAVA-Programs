package com.bridgelabz.utility;

public class Node1<E>
{
	public String data1;
	public int data;
	public Node1 nextNode;
	
	//constructor
	public Node1()
	{
		this.nextNode=null;
	}

	public void setData(String data1)
	{
		this.data1=data1;
		nextNode=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
		nextNode=null;
	}
}