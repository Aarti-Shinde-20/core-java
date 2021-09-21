//WAP a program to check whether entered number is 3 digit or not .If it is a 3 digit no. then do sum of 1st and 3rd digit and print sum.
package ZensarTraining;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number :\n");
	   int num1=sc.nextInt();
       if(num1>99 && num1<=999) {
    	   System.out.println("This is Three digit number");
       }else {
    	   System.out.println("Not three digit number");
       }
          
   }
    	   
	}

 
