import java.util.Scanner;

public class SimpleProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Binary No.:");
		int num1=sc.nextInt();
		
		System.out.print("Enter 2nd Binary No.:");
		int num2=sc.nextInt();
		
		int multiply=num1*num2;
		System.out.println("Product of two binary no.s"+multiply);
  	}

}
