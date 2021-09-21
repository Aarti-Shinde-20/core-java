import java.util.*;
public class CollectionListInterface {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		al.add("Guava");
		al.add("Peru");

		Collections.sort(al);
		for(String fruit:al) {
			System.out.println(fruit);
		}
		System.out.println("Sorting numbers....");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(21);
		al2.add(45);
		al2.add(4);
		al2.add(8);
		al2.add(1);
		
		Collections.sort(al2);
		for(Integer fruit:al2) {
			System.out.println(fruit);
		}
		
	}
}