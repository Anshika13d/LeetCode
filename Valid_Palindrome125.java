package leetCode;

public class Valid_Palindrome125 {
 static boolean isPalindrome(String s) {
	 if(s == null || s.isEmpty()) {
		 return true;
	 }
        s = s.toLowerCase();
        s = s.replaceAll("[,:]", "");
        s = s.replaceAll("\\s","" );
        
        StringBuilder str = new StringBuilder(s);
        
        str.reverse();
        String rev = str.toString();
        if(s.equals(rev)) {
        	return true;
        }
        else {
        return false;
        }
    }
public static void main(String[] args) {
	String s = "A man, a plan, a canal: Panama";
	System.out.println(isPalindrome(s));
}
}
