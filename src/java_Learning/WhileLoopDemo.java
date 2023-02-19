package java_Learning;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// while(condition){}
		/*
		 * do
		 * {
		 * }
		 * while(condition)
		 */
		
	//Scanner scan=new Scanner(System.in);
	//System.out.println("enter the starting number-");
	//int i=scan.nextInt();
	
	
	
	//while 
	//while(i<=20){
	//System.out.println("value of I:-"+i);
	//	i++;
	//}
	//do while loop
	//do{
		//System.out.println("I value-"+i);
		//i++;
	//}while(i<=20);
		
	
			int num=0;
			int i=0;
			int k=0;
			int sum=0;
	do{
		i++;
	   num = sum;
	  sum=sum+i;
	  k=sum;
	  System.out.println(num + "+" + i + "=" +k);
		
	}while(i<10);
	System.out.println("Sum value : " + sum);
	}

}

