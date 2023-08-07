package leetCode;

public class Palindrome_integer {
	static boolean isPalindrome(int n) {
		int r;
		int s = 0;
		int c = n;
		while(n > 0) {
			r = n % 10;
			s = s*10 + n;
			n=n/10;
		}
		if(s==c) {
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	int a = 121;
	System.out.println(isPalindrome(a));
}
}
