package ZensarTraining;

import java.util.Scanner;

public class StringAssignment {

	static int countOccurrence(String str, String word) {
		
		String strarr[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < strarr.length; i++) {
			if (word.equals(strarr[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args ) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scanner.nextLine();
		System.out.println("Enter the word :");
		String word=scanner.next();
		
        System.out.println("Word occurence :"+countOccurrence(str,word));
	
	}
}
        