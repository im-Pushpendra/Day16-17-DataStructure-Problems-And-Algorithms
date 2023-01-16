package com.bridgelabz.day16.UC_Day16and17_Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //storing words in string type of array
	        String[] words = {"Amar","Akshata","Amruta","Arati","Arvind","Aniket","Harsh" };
	        //sorting the array
	        Arrays.sort(words);
	        //printing using inbuilt toString in String class 
	        System.out.println(Arrays.toString(words));
	        System.out.println("Enter A word to search:");
	        String searchWord = sc.next();
	        
	       

	    }
}
