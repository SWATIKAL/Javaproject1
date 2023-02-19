/* Program-14
  
 * for the given string display the middle 2 value, case satisfies only if string is of even length
 * ip - java
 * op - av

 */


package Assignment_3;

public class TwoValueString14_DisplayMiddle {
	public static void main(String[] args) {
		String s1="java";
		System.out.println(printingSubstringOfMiddleChars(s1));
	}
	public static String printingSubstringOfMiddleChars(String s1) {
		String s2=s1.substring((s1.length()/2)-1, (s1.length()/2)+1);
		return s2;
	}

}
