/* Program-28  //check
  
 * String encryption. replace the odd-index character with next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
 * leave the even index as such. return the encrypted string.

 */
*
package Assignment_2;

public class Encryption28String {
	public static void main(String[] args) {
		//String s="Jzotz";
		String s="zwati";
		//String s = "JAVAtesting";   //JBVBtfttjnh  JBVBtfsuioz
		System.out.println(oddEncryptionOfString(s));
		}
	public static String oddEncryptionOfString(String s) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c%2!=0){
				c=(char)(c+1);
				sb.append(c);  
				}
			else
				sb.append(c);   
			}
		return sb.toString();
	}

}
