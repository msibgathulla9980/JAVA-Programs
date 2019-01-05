package com.bridgelabz.utility;
import com.bridgelabz.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Utility
{		   
		//for timer start and stop
		public static double startTimerFunc()
		{
		    double d=System.nanoTime();
		    return d;
		}
		public static double stopTimerFunc()
		{
		    double d1=System.nanoTime();
		    return d1;
		}
		public static double elapsedTime(double stopTime,double startTime)
		{
		    
		    double timeElapsed=stopTime-startTime;
		    return timeElapsed;
		}
		public static List<Double> listCall(List<Double> timeList)
		{
		   Collections.sort(timeList);    
		   return timeList;
		}
		public static Map<String,Double> mapCall(Map<String,Double > map)
		{
		    Map<String, Double> sortedMap = new LinkedHashMap<>();
		     map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		     .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		     return sortedMap;
		}
	}


