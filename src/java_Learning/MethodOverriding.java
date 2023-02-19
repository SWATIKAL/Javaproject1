package java_Learning;

public class MethodOverriding extends SuperClass{

		// parent and child relationship
		//no argumen (same method aregument as parent)
		//dynmic polymorphism
		
      public void mutliplication(int a,int b){
    	  int c=a*b;
    	  System.out.println("child multiplication is-"+c);
      }
      public static void main(String[]args){
    	  SuperClass superclassobj=new MethodOverriding();
    	  superclassobj.mutliplication(45,40);
	}

}
