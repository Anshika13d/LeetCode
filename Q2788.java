package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2788 {
	public static List<String> splitWordsBySeparator(List<String> words, char c) {
        String[] str = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            str[i] = words.get(i);
        }
        for(String a:str){
        }
        List<String> list = convertArrayToList(str);
        return list;
    }
	public static <T> List<T> convertArrayToList(T array[])
    {
  
        // Create the List by passing the Array
        // as parameter in the constructor
        List<T> list = Arrays.asList(array);
  
        // Return the converted List
        return list;
    }
public static void main(String[] args) {
	List<String> l1 = new ArrayList<>();
	l1.add("one.two.three");
	l1.add("four.five");
	System.out.println(splitWordsBySeparator(l1,'.'));
}
}
