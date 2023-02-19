/* Program-22  //check - corrected
  
 * Enter your name and return a string "print the title first and then comma and then first letter of initial name.
 */

package Assignment_2;

import java.util.StringTokenizer;

public class ReturnStringx22 {
	public static String retrieveName(String s1){
		StringTokenizer t=new StringTokenizer(s1," ");
		String s2=t.nextToken();
		String s3=t.nextToken();
		//StringBuffer sb=new StringBuffer(s2);
		StringBuffer sb=new StringBuffer(s1);
		sb.append(',').append(s1.charAt(0));
		return sb.toString();
	}
	public static void main(String[] args) {	
		String s1="Swati Kale";
		System.out.println(retrieveName(s1));
	}

}
