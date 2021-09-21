import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
		 al.add("A");
		 al.add("B");
		 al.add("Z");
		 al.add("Big");
		 al.add("K");
		 System.out.println("An initial list of elements:"+al);
		 al.remove(3);
		 System.out.println("After removing index"+al);
		 al.remove("Z");
		 System.out.println("After removing object"+al);
//		 creating another arrayList
		 ArrayList<String> al2=new ArrayList<String>();
		 al2.add("arti");
		 al2.add("Gaurav");
		 al2.add("Shonak");
		 al.addAll(al2);
		 System.out.println("Updated list"+al);
		 al.removeAll(al2);
		 System.out.println("After invoking removeAll()method "+al);
		 al.removeIf(str -> str.contains("A"));   //Here, we are using Lambda expression   
         System.out.println("After invoking removeIf() method: "+al);  
         al.clear();
         System.out.println("After invoking clear() method"+al);
		 
	}

}
