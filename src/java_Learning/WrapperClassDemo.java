package java_Learning;

public class WrapperClassDemo {
	//primitive data type-boolean,int,short,,byte,float,double
	//wrapper class-int-->Integer,boolean-->Boolean,byte-->Byte
	//Autoboxing-primitive-->object
	//Unboxing-->object-->primitive

	public static void main(String[] args) {
		//Autoboxing
		int i=20; //primitive data 
		Integer j=i;
		System.out.println(j);
		 
		char c='l';
		Character k=c;
		System.out.println("charaacter is-"+k);
		
		//Unboxing
		Integer x=5;
		int a=x;
		System.out.println("int value is-"+a);
	}

}
