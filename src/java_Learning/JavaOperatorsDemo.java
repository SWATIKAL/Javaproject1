package java_Learning;

public class JavaOperatorsDemo {
	
	public static int total;
	
	public static void main(String[] arg){
		
		addition(20,30);
		substraction(40,50);
		mudularOperation(50,15);
		multiplication(2,2);
		division(10,2);
		
	}
	public static void addition(int a,int b){
		//addition
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	public static void substraction(int firstnumber,int secondnuber){
    total=firstnumber-secondnuber;
    System.out.println("substraction is"+total);
	}
	public static void mudularOperation(int firstnumber,int secondnuber){
		int modresult=firstnumber%secondnuber;
		System.out.println("modularesult :"+modresult);
	}
	public static void multiplication(int a,int b){
		//multiplication
		int mul=a*b;
		System.out.println("multiplication is:"+mul);
	}
	public static void division(int a,int b){
		//division 
		int div=a/b;
		System.out.println("division is:"+div);
	}
	
	
}
