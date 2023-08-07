package leetCode;

import java.util.Arrays;

public class Plus_one66 {
	static int[] plusOne(int[] digits) {
		
		if(digits.length == 1) {
   		 return digits;
   	 }
        for(int i=0;i<=digits.length;i++) {
        	 digits[digits.length-1] = digits[digits.length-1] | 1;
        	 
        }
        return digits;
    }
public static void main(String[] args) {
	int[] arr = {1,2,3};
	System.out.println(Arrays.toString(plusOne(arr)));
}
}
