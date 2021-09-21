package ZensarTraining;

public class AllFunctionsString {

	public static void main(String[] args) {
      String str1="Hello ";
      String str2="Listen";
      String str3=" JAVATPOINT Tutorial";
      System.out.println("concat() :"+str1.concat(str2));
      System.out.println("equals() :"+str1.equals(str2));
      System.out.println("charAt() :"+str1.charAt(0));
      System.out.println("compareTo() :"+str1.compareTo(str2));
      System.out.println("split() :"+str3.split(str3, 4));
     
      String[] str4=str3.split(" ");
      System.out.println(str4);
	}

}
