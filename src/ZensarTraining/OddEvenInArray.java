package ZensarTraining;

public class OddEvenInArray {

	public static void main(String[] args) {
		int a[]={1,2,3,2,45,6,8,5,46};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		 
	}

}
