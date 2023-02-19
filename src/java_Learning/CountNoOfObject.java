package java_Learning;

public class CountNoOfObject {

	
     static int count =0;
     CountNoOfObject(){
    	count++;
    	System.out.println("object count is-"+count);
     }
     public static void main(String[] args){
    	 CountNoOfObject obj = new CountNoOfObject();
    	 CountNoOfObject obj1 = new CountNoOfObject();
    	 CountNoOfObject obj2 = new CountNoOfObject();
    	
     
	}

}
