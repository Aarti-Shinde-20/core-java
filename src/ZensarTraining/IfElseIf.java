package ZensarTraining;

public class IfElseIf {

	public static void main(String[] args) {
		//if else if
		
		/*
		 * int marks = 96; if (marks < 50) { System.out.println("Fail"); } else if
		 * (marks >= 50 && marks < 60) { System.out.println("C grade"); } else if (marks
		 * >= 60 && marks < 70) { System.out.println("B grade"); } else if (marks >= 70
		 * && marks < 80) { System.out.println("A grade"); } else {
		 * System.out.println("A+"); }
		 */	
		
		//nested if
		
		/*
		 * int age=19; int weight=55; if(age>=18) { if(weight>=50) {
		 * System.out.println("Eligible to donate Blood"); } }
		 */
		
		// ternary opeartor 
		/*
		 * int a=12; 
		 * int b=13; 
		 * int min=(a<b)?a:b; 
		 * System.out.println(min);
		 */
	 
//		int a=-9;
//		String s=(a>0)?"Positive":(a<0)?"Negative":"Zero";
//		System.out.println(s);
		
		char op='+';
		int a=3;
		int b=2;
		int n = (op=='+')?a+b:(op=='-')?a-b:op=='*'?a*b:0;
		System.out.println(n);
		
		char op1='/';
		float c=2.8f;
		float d=1.6f;
		float e= (op1=='/')?c/d:(op1=='*')?c*d:0;
		System.out.println(e);
		
		int num=00;
		String num1=(num%2==0)?"even":(num%2!=0)?"odd":"zero";
		System.out.println(num1);
		
		int num2=49;
		String num3=(num2%5==0)?"Divisible by 5":(num2%5!=0)?"Not Divisible by 5":"Invalid";
		System.out.println(num3);
		
		int x=20;
		int y=23;
		int z=70;
		int temp=(x>y)?x:y;
		int s=z>temp?z:temp;
		System.out.println("s: "+s);
		System.out.println("temp: "+temp);
 	}
	
	}
