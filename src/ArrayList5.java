import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) { 
		Student s1=new Student(100, "Anuj", 25);
		Student s2=new Student(101, "Siya", 24);
		Student s3=new Student(102,"Aarti",23);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext()) { 
			Student st=(Student)itr.next();
			System.out.println(st.age+" "+st.name+" "+st.rollno);
		}
		
	}

}
