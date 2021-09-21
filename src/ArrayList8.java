import java.util.ArrayList;
import java.util.List;
public class ArrayList8 {

	public static void main(String[] args) {
	 List<Book> list=new ArrayList<Book>();
	  Book b1=new Book(12314, "Java", "S.N Patil", "Technical", 10);
	  Book b2=new Book(12378, "Advance Java", "P.M. Patil", "Prakash", 15);
	  Book b3=new Book(12315, "CPP", "Shrma", "Nirmal", 7);
      list.add(b1);
      list.add(b2);
      list.add(b3);
      for(Book b:list) {
    	  System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.quantity);
      }
	}

}
