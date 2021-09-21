
public class StringProgram {
	
	public static void main(String[] args) {
		String s1="           Java   ";
		System.out.println(s1);
		String s2=" oops";
		String s3=" Java";
		String s5=" Boat";
		System.out.println(s1.equals(s3)); //true
		String s4=new String("Boat");  
		String s6=new String("boat"); 
        System.out.println("== :"+s4==s6);//false
		System.out.println("== :"+s5==s4);//false
		
		System.out.println("equals :"+s4.equals(s6));
		System.out.println("equals :"+s5.equals(s4));
		System.out.println("equalIgnorecase :"+s5.equalsIgnoreCase(s6));
		
		String b1=" book";
		System.out.println("charAt() :"+b1.charAt(2));
		System.out.println("length() :"+b1.length());
		System.out.println("IndexOf() :"+b1.indexOf(3));
		 
		System.out.println("compareto() :"+"AB".compareTo("AB"));
		System.out.println("compareto() :"+"ABC".compareTo("ABD"));
		System.out.println(s1.concat(b1));
		
        String str1="Java String is";	
		System.out.println(str1);
		str1=str1.concat(" Immutable ....");
		System.out.println(str1 );
		
//		String d=s1.concat(s2).concat(s3);
//		System.out.println(d);
		
		String b2="  Soniya  ";
		b2=b2.trim();
		System.out.println(b2);
		
	}

}
