package java_Learning;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {
	//lehacy class used to deeal with key value pair 
	//unique key (no dup keys allowed)
	//does not allow null value/key
	//its synchronized(thread safe)
	public static void main(String[] args){
		Hashtable<String,String> table=new Hashtable<>();
		table.put("name", "rohan");
		table.put("AGE", "26");
		table.put("Occupatio", "software Engg");
		table.put("Technology", "automation testing");
		//table.put("XYZ", null);
		table.remove("Occupation");
		for(Entry<String,String> m1 : table.entrySet()){
			System.out.println(m1.getKey()+"-"+ m1.getValue());
			
		}
	}
	

}
