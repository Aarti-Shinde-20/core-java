//4. Write a Java program to input any alphabet and check whether it is vowel or consonant 
package ZensarTraining;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter any alphabet");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' && ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a Vowel");
		} else {
			System.out.println(ch + " is a consonant");
		}
	}

}
