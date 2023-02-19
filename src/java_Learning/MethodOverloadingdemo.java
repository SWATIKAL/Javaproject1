package java_Learning;

public class MethodOverloadingdemo {
	//polymorphism-1.methodoverloading and 2.methodoverriding
	// methodoverloading -a.by
	
	
	public static void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("1addition is-"+c);
	}
	public static void addition(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("3addition is-"+c);
	}
	public static void addition(int a,int b,int d,int s)
	{
		int c=a+b+d+s;
		System.out.println("4addition is-"+c);
	}
	public static void addition(float a,float b,float d)
	{
		float c=a+b+d;
		System.out.println("float addition is-"+c);
	}
	public static void addition(double a,double b)
	{
		double c=a+b;
		System.out.println("double addition is-"+c);
	}
	//public static void addition(int a,float b,double c)
	//{
	//	double d=a+b+c;
	//	System.out.println("mix parent data type addition is-"+c);
	//}

	public static void main(String[] args) {
		//addition(3,2);
		//addition(3,2,4);
		addition(3,2,4,5);
		//addition(3.0f,2.0f,4.0f);
		//addition(30d,20d);
		//addition(5,2,4.45638736);
	}

}
