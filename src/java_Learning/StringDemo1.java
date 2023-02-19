package java_Learning;

public class StringDemo1 {

	public static void main(String[] args) {
		
     StringBuilder sb=new StringBuilder("I am learning ");
     sb.append("Automaation");
     System.out.println(sb);
     
     sb.replace(14, 23, "Selenium");
     System.out.println(sb);
     sb.delete(13, 23);
     System.out.println(sb);
     sb.reverse();
     System.out.println(sb);
	}

}
