//3. Write a Java program to find maximum between three numbers 
package ZensarTraining;

import java.util.Scanner;

public class MaxNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1 = sc.nextInt();
		System.out.print("Enter second number :");
		int num2 = sc.nextInt();
		System.out.print("Enter third number :");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + ": is Greater Number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + ": is Greater Number");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + ": is Greater Number");
		}
		 

		
		//3. Write a Java program to find smaller between three numbers 
		
		
//		if (num1 < num2 && num1 < num3) {
//			System.out.println(num1 + ": is Smaller Number");
//		} else if (num2 < num1 && num2 < num3) {
//			System.out.println(num2 + ": is Smaller Number");
//		} else if (num3 > num1 && num3 > num1) {
//			System.out.println(num3 + ": is Smaller Number");
//		}

	}

}
