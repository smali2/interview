package com.google.interview.bubbleSort;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int num = 0;
		while (in.hasNext()) {
			a[num++] = in.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
		    // Track number of elements swapped during a single array traversal
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            int first = a[j+1];
		            a[j+1] = a[j];
		            a[j] = first;
		            numberOfSwaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		    	System.out.printf("Array is sorted in %s swaps",numberOfSwaps);
		    	System.out.println("First Element: "+a[0]);
		    	System.out.println("Last Element: "+a[n]);
		    	break;
		    }
		    
		}
		
	}
	
}
