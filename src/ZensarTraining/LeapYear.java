//1. Write a Java program to check whether a year is leap year or not 
package ZensarTraining;

public class LeapYear {

	public static void main(String[] args) 
	{
		 int y=2021; 
		 System.out.println();
		 if((y % 400 ==0) || ((y%4 ==0) && (y%100 !=0)))  {
			System.out.println(y+": is a leap year");
		} else
		{
			System.out.println(y+ ": is not a leap year");
			System.out.println();
		}
	}

}
