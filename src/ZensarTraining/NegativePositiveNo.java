//6. Write a Java program to check whether a number is negative, positive or zero 
package ZensarTraining;

import java.util.Scanner;

public class NegativePositiveNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is zero");
		}
	}

}
