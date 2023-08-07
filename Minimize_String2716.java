package leetCode;

public class Minimize_String2716 {
	public static int minimizedStringLength(String s) {
        int c = s.length();
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c = c - 1;
            }
            else if( s.charAt(i) == s.charAt(i-1)) {
            	c = c - 1;
            }
        }
        return c;
    }
public static void main(String[] args) {
	String s = "cbbd";
	System.out.println(minimizedStringLength(s));
}
}
