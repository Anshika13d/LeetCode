package leetCode;

public class Q17Google {
	static void key(String pro, String unpro) {
		if(unpro.isEmpty()) {
			System.out.println(pro);
			return;
		}
		
		int digit = unpro.charAt(0) - '0';
		
		for(int i=(digit -1)*3;i<digit*3;i++) {
			char toadd = (char)('a' + i);
			key(pro + toadd, unpro.substring(1));
		}
	}
public static void main(String[] args) {
	key("","12");
}
}
