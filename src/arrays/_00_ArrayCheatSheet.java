package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] ray = new String[5];
		ray[0] = "pizza";
		ray[1] = "chicken";
		ray[2] = "rice";
		//2. print the third element in the array
		System.out.println(ray[2]);
		//3. set the third element to a different value
		 ray[2] = "brown rice";
		//4. print the third element again
		System.out.println(ray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < ray.length; i++) {
			System.out.println(ray[i]);
		}
		
		//6. make an array of 50 integers
		int num[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < num.length; i++) {
			Random randy = new Random();
		int value = randy.nextInt(51);
		num[i] = value;	
		
		if (num[i]<1) {
			System.out.println(num[i]);
		}
		else if (num[i]>49) {
			System.out.println(num[i]);
		} 
		}
		//8. without printing the entire array, print only the smallest number in the array
	
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
