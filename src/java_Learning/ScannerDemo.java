package java_Learning;

import java.util.Scanner;

public class ScannerDemo {
	
      
	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter FirstNumber");
		int FirstNumber=scan.nextInt();
		System.out.println("Enter secondNumber");
		int secondNumber=scan.nextInt();
		System.out.println("Enter operator :");
		String operator=scan.next();
		
	
	int num=FirstNumber + secondNumber;
	if (operator=="+"){
		num=FirstNumber + secondNumber;
	}
	else if (operator=="-"){
		num=(FirstNumber - secondNumber);
	
	}
	else if (operator=="*"){
		num=(FirstNumber * secondNumber);
	}
	else if (operator=="/"){
		num=(FirstNumber / secondNumber);
	}
	
	System.out.println("add"+ " " +FirstNumber + " "+ operator + " "+ secondNumber + " = " +num);
	
	
	
	   }
	
	
}
	
	
	


