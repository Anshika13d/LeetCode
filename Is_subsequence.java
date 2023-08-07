package leetCode;

public class Is_subsequence {
	 static boolean isSubsequence(String s, String t) {
		 if(s == null || s.isEmpty()) {
			 return true;
		 }
		 int i = 0;
		 int j = 0;
		 
		 while(i < s.length() && j < t.length()) {
			 if(s.charAt(i) == t.charAt(j)) {
				 i++;
			 }
			 j++;
		 }
		 return i == s.length();
	    }
public static void main(String[] args) {
	String s = "abc";
	String t = "ahbgdc";
	System.out.println(isSubsequence(s,t));
}
}
