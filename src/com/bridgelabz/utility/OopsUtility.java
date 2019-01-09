package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class OopsUtility {
	//Take Statement And return Array of words
		public String[] wordsArrayFromStatement(String statement){	
			StringTokenizer st = new StringTokenizer(statement," ");
			String words[]=new String[st.countTokens()];
			int i=0;
			while(st.hasMoreTokens()){
				words[i]=st.nextToken();
				i++;
			}
			return words;
		}
		public static String readFile(String str) throws FileNotFoundException {
	        FileReader f = new FileReader(str);
	        @SuppressWarnings("resource")
	        BufferedReader read = new BufferedReader(f);
	        String line = "";
	        try {
	            String word="";
	            while ((word = read.readLine()) != null) {
	                line = word;
	            }
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        return line;
	    }
}
