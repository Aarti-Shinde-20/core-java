package com.array.ZensarTraining;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
  
		
		int n,sum = 0;
		float average ;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no. of elements you want in array :");
		n =scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter All elements :");
		for(int i=0; i<n;i++) {
			a[i]=scanner.nextInt();
			sum=sum+a[i];
		}
 		System.out.println("Sum :"+sum);
 		average=(float)sum /n;
 		System.out.println("Average :"+average);
               
	}

}
