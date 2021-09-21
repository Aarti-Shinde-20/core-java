import java.util.ArrayList;
import java.util.Iterator;

import ZensarTraining.StaticKeyword;

public class ArrayList7 {
   public static void main(String[] args) {
	 System.out.println(StaticKeyword.num);
	ArrayList<String> al=new ArrayList<String>();
	al.add("mona");
	al.add("Ajay");
	al.add("Paresh");
	al.add("Einstine");
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("Vijay");
	al2.add("raj");
	al.retainAll(al2);
	al.addAll(al2);
	System.out.println("iterating elements after retainAll method"+al);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	}

}
