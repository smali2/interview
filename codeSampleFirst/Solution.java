package com.google.interview.codeSampleFirst;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {

	class Pair {
		int firstDigit;
		int secondDigit;
	}
	
	private static HashMap<Double, Integer> digits = new HashMap<>();
	private static ArrayList<Integer> newNums = new ArrayList<>();
	
    public int solution(int X) {
        // Get all the digits and add to digits
    	// first obtain highest power of 10 that divides X
    	double pow = 0;
    	double powSave = 0;
    	while (X%Math.pow(10,pow+1)>0) {
    		pow++;
    	}
    	powSave = pow;
    	// Now sequentially get each digit starting from left
    	// and save to digits
    	while (pow>0) {
    		digits.put(pow, (int) (X%Math.pow(10,pow)));
    		pow--;
    	}
    	// now work with each adjacent keys, and get averages stored in a list
    	ArrayList<Integer> averages = new ArrayList<>();
    	for (double i =1; i<=powSave-1; i++) {
    		if (digits.containsKey(i) && digits.containsKey(i+1)) {
    			long ans = (digits.get(i+1) + digits.get(i))/2;
    			averages.add((int) ans);	
    		}
    	}
    	
    	// Starting from the right most digit, make new numbers
    	for (int start = 1; start < powSave-1; start++) {
    		int temp = averages[start];
    		
    	}
    	
    }
}