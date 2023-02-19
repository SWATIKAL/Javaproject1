package java_Learning;

import java.io.FileInputStream;

public class ExceptionDemo {
	//exceptopn -abnorml/unwaanted event when will ddisrupt execution of program
	//exception handling handling the exception to chive normal flow of program
	//.using try catch block
	//throwe-decalare the exception

	public static void main(String[] args) {
		exceptionworking();
	}
	public static void exceptionworking(){
		//getting error when we run the program-runtime(uncheckedexepction)
		int i=5;
		int k=0;
		try{
			int a=i/k;
			System.out.println("caught arithmatic exception");
		}
		System.out.println("checked execption");
		int x[]=new int[2];
		try{
			x[3]=5;
			System.out.println(x);
		}catch(Exception ex){
			System.out.println("ArrayINdexOutofBoundException caught");
		}
		String s="sid";
		try{
			System.out.println(s.charAt(4));
		}chatch(IndexOutOfBoundsxception ex1){
			System.out.println("String out of bound caught");
		}
		//during compile time-checked excepption 
		try{
			c file = new FileInpuStrea(new File("test"));
		}catch(FileNotFoundException e){
			System.out.println("File not found exc")


		}
		

	}

}
