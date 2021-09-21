//2. Write a Java program to check whether a number is divisible by 5 and 11 or not 
package ZensarTraining;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//       if(num%5==0 )
//       {
//    	   System.out.println("Number is Divisible by 5 ");
//       }else  
//       {
//    	   System.out.println("Number is not Divisible by 5");
//    }

		if (num % 11 == 0) {
			System.out.println("Number is Divisible by 11");
		} else {
			System.out.println("Number is not Divisible by 11");
		}

	}

}
