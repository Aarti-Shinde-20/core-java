import java.util.ArrayList;

public class ArrayListIsEmpty {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
		 System.out.println("Is ArrayList Empty :"+al.isEmpty());
		 al.add("Ravi");
		 al.add("Ajay");
		 al.add("Soham");
		 System.out.println("After insertion");
		 System.out.println("Is ArrayList Empty :"+al.isEmpty());

	}

}
