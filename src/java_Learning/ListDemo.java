package java_Learning;

import java.util.ArrayList;
import java.util.Iterator;



public class ListDemo {
	//list types data[1,2,3,4,5,6]
	//duplicate data allowwed[1,1,2,2,3,4,6,6]


	public static void main(String[] args) {
		int a[]=new int [5]; //array-size fix
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(2,30);
		System.out.println(list);
		list.remove(1);
		System.out.println("updated listed after removal-"+list);
		list.add(50);
		System.out.println(list.get(0));
		System.out.println(list);
		//to iterate ArryList
		for (int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(Integer k:list){
			System.out.println(k);
		}
         //Using Iterator
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
