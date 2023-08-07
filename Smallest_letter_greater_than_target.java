package leetCode;

public class Smallest_letter_greater_than_target {
	static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = (char) (letters.length - 1);
		
		while(start <= end) {
			int middle = start + (end - start)/2;
			
			if(target<letters[middle]) {
				end = middle - 1;
			}
			else {
				start = middle + 1;
			}
			
		}
		return letters[start%letters.length];
		
	}
	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'f';
		char ans = nextGreatestLetter(letters,target);
		System.out.println(ans);
	}

}
