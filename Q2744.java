package leetCode;

import java.util.Arrays;

public class Q2744 {
	static int count(String[] words) {
        int count = 0;
        StringBuilder s = new StringBuilder();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                s.append(words[j]);
                if(words[i].equals(s.reverse().toString())){
                    count++;
                }
                s.delete(0,s.length());
            }
        }
        return count;
    }
public static void main(String[] args) {
	String[] words = {"cd","ac","dc","ca","zz"};
	System.out.println(count(words));
 }
}
