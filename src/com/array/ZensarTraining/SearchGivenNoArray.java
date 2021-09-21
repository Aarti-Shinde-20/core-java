//3.	WAP to search for a given number in an array and accordingly print the index if exists.
package com.array.ZensarTraining;

public class SearchGivenNoArray {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
	    int toFind = 6;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	}
