package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.w3c.dom.Node;

import java.lang.IndexOutOfBoundsException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class DataStructureUtility {
	/*
	public static void main(String[] args) {
		
		  static void word(String s1 ,UnorderedList<String> list) {
		  System.out.println(list.size()); if (list.search(s1)) { list.remove(s1);
		  System.out.println(list); } }
		 

	}*/
	
	public  static class UnorderedList<U> implements List<T>, Iterable<T>
	{
	    private static int MAX_SIZE = 100;
	    private int size;
	    private Node[] nodeElements;

	    public UnorderedList()
	    {
	        nodeElements = new Node[MAX_SIZE];
	    }

	    public UnorderedList(int capacity)
	    {
	        MAX_SIZE = capacity;
	        nodeElements = new Node[MAX_SIZE];
	    }

		public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		public void add(String next) {
			// TODO Auto-generated method stub
			
		}

	   /* public boolean isFull()
	    {
	        return (size() == MAX_SIZE);
	    }

	    public boolean isEmpty()
	    {
	        return (size() == 0);
	    }

	    public int size()
	    {
	        return size;
	    }

	    public boolean add(T data)
	    {
	        try
	        {
	            Node<T> node = new Node<>(data);
	            nodeElements[size++] = node;
	            return true;
	        }
	        catch (IndexOutOfBoundsException ex)
	        {
	            System.out.println(ex.getMessage());
	            throw new IndexOutOfBoundsException();
	        }
	    }

	    @Override
	    public void remove(T data)
	    {
	        int index = locate(data);
	        try
	        {
	            nodeElements[index] = nodeElements[size() - 1];
	            size--;
	        }
	        catch (IndexOutOfBoundsException ex)
	        {
	            throw new NoSuchElementException();
	        }
	    }

	    public boolean find(T data)
	    {
	        return (locate(data) >= 0);
	    }

	    private int locate(T data)
	    {
	        for (int index = 0; index < size(); index++)
	        {
	            if (data == nodeElements[index].getData())
	            {
	                return index;
	            }
	        }
	        return - 1;
	    }

	    @Override
	    public Iterator<T> iterator()
	    {
	        return new ULIterator<T>();
	    }

	    private class ULIterator<T> implements Iterator<T>
	    {
	        private int currentIndex = 0;

	        public boolean hasNext()
	        {
	            return (currentIndex < size());
	        }

	        public T next()
	        {
	            if(hasNext())
	            {
	                return (T)nodeElements[currentIndex++].getData();
	            }
	            else
	            {
	                throw new NoSuchElementException();
	            }
	        }
	    }
	}*/
	
}
}