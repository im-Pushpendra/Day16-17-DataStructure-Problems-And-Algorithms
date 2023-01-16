package com.bridgelabz.day16.UC_Day16and17_Datastructure;

import java.util.Arrays;
import java.util.Scanner;

/*
 * An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....
 */

public class AnagramDetection {
	public static void checkAnagram(String str1, String str2) {
		/*
		 * here replace all method is used to remove spaces
		 *
		 */
		str1 = str1.replaceAll(" ", "");
		str2 = str2.replaceAll(" ", "");
		boolean result = true;
		
		
		/*
		 * checking whether the two strings entered are of same length or not 
		 */
		if (str1.length() != str2.length()) {
			result = false;
		} else {
			//converting our strings into character array and each character will be stored at
			//different index and will be easy to compare after sorting.
			char[] StringArray1 = str1.toLowerCase().toCharArray();
			char[] StringArray2 = str2.toLowerCase().toCharArray();
			
			//here both the character arrays are sorted using Arrays inbuilt sort method
			Arrays.sort(StringArray1);
			Arrays.sort(StringArray2);
			
			//checking whether both the sorted arrays are same or not
			result = Arrays.equals(StringArray1, StringArray2);

		}
		//if both length and the sorted list is same then they are anagrams
		if (result == true) {
			System.out.println(str1 + " and " + str2 + " are anagrams ");
		} else {

			System.out.println(str1 + " and " + str2 + " are not anagrams ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter first String");
		String str1 = "abcd";
		// System.out.println("Enter second String");
		String str2 = "dcba";
		checkAnagram(str1, str2);

	}
}
