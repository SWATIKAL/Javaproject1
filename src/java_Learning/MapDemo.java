package java_Learning;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	//map is used to deal with key value pair
	//it contains unique key
	//HasMap-does not maintainn insertion order
	//LinkHasMap-maintains insertionorder

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("firstName", "Sachin");
		map.put("LastName", "Tendulkar");
		//travesring thorugh map using entryset
		for(Map.Entry<String, String> m: map.entrySet()){
			String key=m.getKey();
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		//converting to set
		Set<Entry<String,String>> test=map.entrySet();
		Iterator<Entry<String,String>> itr=test.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
