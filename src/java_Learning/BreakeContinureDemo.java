package java_Learning;

public class BreakeContinureDemo {
	//break;
	//continue
	

	public static void main(String[] args) {
		
       for(int i=0; i<10;i++){
    	   if(i==5){
    	   break; //-break the complete loop execution
       }
    	   System.out.println("bresk:-"+ i);
       }
       
       for(int k=0; k<10;k++){
    	 if(k==5){
    	   continue;// skip the loop for current value
    	 }
    	   System.out.println("Continue:-"+k);
       
	}
}

}
