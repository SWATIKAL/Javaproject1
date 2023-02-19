package java_Learning;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
	//fot unique data(value)-duplicate data is not allowed 
	//null value allowed 
	//hashset -does not maintain insertion order
	//linkedHashset-maintains insertion order

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("sachin");
		set.add("sourav");
		set.add("rahul");
		set.add("sachin");
		System.out.println(set);
		set.remove("rahul");
		set.add(null);
		System.out.println("Orginal"+set);
		object sample=set.clone();
		System.out.println("cloned set"+sample);
		System.out.println("Orginal"+set);
		
		LinkedHashSet<String> linkset=new LinkedHashSet();
        linkset.add("anil");
        linkset.add("shrinath");
        linkset.add("zaheer");
        
	}

}
