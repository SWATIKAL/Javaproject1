package java_Learning;

public class AccessModifierDemo {

	
		// private,default,protected,public
		//class,variable,methods,constuctor
		private static int a=20;
		//public static int b=15;
		private void addition(int a1,int b){
			int sum=a1+b;
			System.out.println("value of sum"+sum);
			System.out.println(a);
		}
		public static void main(String[] args){
			System.out.println(a);
		}

	}


