package java_Learning;

public abstract class AbstractClassDemo {
  //you can not create object of abstract object
	//concrete method 
	public  void addition(int a,int b) {
		int c=a+b;
		System.out.println("sum is "+c);
	}
	//concrete method
	public final static void substrsction(int a,int b){
		int c=a+b;
		System.out.println("subtraction is"+c);
	}
	//abstract method
	public abstract void multiplication();
	public abstact void division();

	}


