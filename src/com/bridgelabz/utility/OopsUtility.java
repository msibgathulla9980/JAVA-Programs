package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;



public class OopsUtility {
	
	
	
	static ObjectMapper objectMapper = new ObjectMapper();
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
	public static String readFile(String str) throws IOException {
		FileReader f = new FileReader(str);//reads the file, an inbuilt method
		BufferedReader read = new BufferedReader(f);//Buffered Reader is the method used to read line by line
		String line = "";

		String word="";
		while ((word = read.readLine()) != null) 
		{
			line = word;
		}



		return line;
	}
	public static void write(String json) throws IOException
	{
		FileWriter fw = new FileWriter("F:\\Mohammed Sibgath1\\Bridgelabz\\JavaPrograms\\JAVA-Programs\\src\\com\\bridgelabz\\objectorientedprograms\\Inventory.json");
		BufferedWriter bw = new BufferedWriter(fw);//takes the string and writes it one by one.
		bw.write(json);
		bw.flush();
	}
	public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(listOfInventories);
		return inventoryList;
	}
	static List<Inventory> liInventories = new ArrayList<Inventory>();
	public static List<Inventory> insertInventory(String name,float weight,double price)
	{
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		liInventories.add(inventory);
		return liInventories;
	}

	public static void display(List<InventoryList> list2)//iterating the list2 and printing it
	{
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);//iterating the another inventory list

			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) //list of inventories
			{
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
				System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}

	}
	public static Inventory insertInventoryDetail()
	{
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(DataStructureUtility.userString());
		System.out.println("Enter weight of inventory in kilograms");
		inventory.setWeight(DataStructureUtility.userFloat());
		System.out.println("Enter price of inventory in rupees");
		inventory.setPrice(DataStructureUtility.userDouble());
		return inventory;
	}

	public static String price(List<InventoryList> list2)
	{

		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
		return null;
	}
	public static String replaceString(String first,String fullName,String phoneNum,String date,String line) {
		final  String REGEX_NAME1 = "<<name>>";
		final  String REGEX_NAME2 = "<<full name>>";
		final  String REGEX_NAME3 = "xxxxxxxxxx";
		final  String REGEX_NAME4 = "xx/xx/xxxx";
		Pattern p1 = Pattern.compile(REGEX_NAME1);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);

		Pattern p2 = Pattern.compile(REGEX_NAME2);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);

		Pattern p3 = Pattern.compile(REGEX_NAME3);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);

		Pattern p4 = Pattern.compile(REGEX_NAME4);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}

	public static String readJsonFile(String filename) throws IOException{
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String str ="";
		String line = "";
		while((line=br.readLine())!=null){
			str+=line;
		}
		br.close();
		return str;
	}
	public static void writeFile(String json,String filename) throws IOException
	{
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);//takes the string and writes it one by one.
		bw.write(json);
		bw.flush();
	}
	//Function take String in dd/mm/yyyy format and return Date Object
		public static Date printDate(String date){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy ");
			try{
				return sdf.parse(date);
			}
			catch(ParseException pe){
				return null;
			}
		}
		public static String getDate() {
	        Date date = new Date();
	        String strDateFormat = "hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	        String Date= dateFormat.format(date);
	        return Date;
		}
		/**
		 * static object is created for Scanner class to avoid multiple object creations
		 * of the same class.
		 */

		static Scanner scanner = new Scanner(System.in);

		/**
		 * static function to read integers input from the user
		 * 
		 * @return integer values that are read
		 */

		public static int userInt() {

		    return scanner.nextInt();

		}
		public static float userFloat() {

		    return scanner.nextFloat();

		}

		/**
		 * static function to read double input from the user
		 * 
		 * @return double values that are read
		 */
		public static double userDouble() {

		    return scanner.nextDouble();

		}

		/**
		 * static function to read boolean input from the user
		 * 
		 * @return boolean values that are read
		 */
		public static boolean userBoolean() {

		    return scanner.nextBoolean();

		}

		/**
		 * static function to read string input from the user
		 * 
		 * @return strings that are read
		 */
		public static String userString() {
		    return scanner.next();

		}
		public static long userLong() {

		    return scanner.nextLong();

		}

		public static <T> List<T> userReadValue(String str, Class<?> clazz) throws JsonParseException, JsonMappingException, IOException{
			CollectionType collection = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);//to tell the compiler that it is a collection type of list
			return objectMapper.readValue(str, collection);
		}
		
		public static <T> String userWriteValueAsString(List<T> list) throws JsonGenerationException, JsonMappingException, IOException{
			return objectMapper.writeValueAsString(list);
		}
//		public static QueueLinkedList<QueueLinkedList<String>> deckQueueStore(String[] deck )
//        {
//            QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>(deck);
//            QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>(deck);
//            System.out.println("Total numver of deck of cards are " + deck.length);
//            //storing those cards of particular person in an array
//            for (int i = 0; i < 4; i++) {
//                String[] demo = new String[9];
//                for (int j = 0; j < 9; j++) {
//                    demo[j] = deck[i + j * 4];
//                }
//                //sorting demo array and storing in str2
//                String[] str2 = sortArray(demo);
//                for (int k = 0; k < str2.length; k++) {
//                    queueLinkedList.enqueue(str2[k]);//inserting it to one queue
//                }
//                mainQueue.enqueue(queueLinkedList);//inserting to the main queue
//                queueLinkedList = new QueueLinkedList<String>(str2);//takes the cards of the particular person corresponding to the indices
//                continue;
//            }
//            return mainQueue;
//        }
//        public static void displayDeck(QueueLinkedList<QueueLinkedList<String>> mainQueue)
//        {
//            for (int i = 0; i < mainQueue.getSize(); i++) {
//                QueueLinkedList<String> queue2 = mainQueue.dequeue();
//                System.out.println("---------------------------------------- Person " + (i + 1)
//                        + " -------------------------------------------");
//                for (int j = 0; j < queue2.getSize(); j++) {
//                    System.out.print(queue2.dequeue() + " ");
//                }
//                System.out.println();
//            }
//        }
public static <T extends Comparable<T>> T[] sortArray(T str[]) {
        int length = str.length;
        for (int i = 1; i < length; i++) {
            T key = str[i];
            int j = i - 1;
            while (j >= 0 && ((str[j].compareTo(key) > 0))) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = key;
        }
        return str;
    }


}




