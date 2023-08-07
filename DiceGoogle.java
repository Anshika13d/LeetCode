package leetCode;

import java.util.ArrayList;

public class DiceGoogle {
	static void dice(String pro, int target) {
		if(target == 0) {
			System.out.println(pro);
			return;
		}
		
		for(int i=1;i<=6 && i<=target;i++) {
			dice(pro + i, target-i);
		}
	}
	static ArrayList<String> dice2(String pro, int target){
		if(target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(pro);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1;i<=6 && i<=target;i++) {
			list.addAll(dice2(pro + i, target - i));
		}
		return list;
	}
	static void diceconstantface(String pro, int target, int face) {
		if(target == 0) {
			System.out.println(pro);
			return;
		}
		
		for(int i=1;i<=face && i<=target;i++) {
			diceconstantface(pro + i, target-i,face);
		}
	}
public static void main(String[] args) {
	dice("",4);
	System.out.println();
	System.out.println(dice2("",5));
	System.out.println();
	diceconstantface("",3,2);
}
}
