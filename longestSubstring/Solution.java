package com.google.interview.longestSubstring;

import java.util.Arrays;
import java.util.HashMap;

import com.google.interview.TwoSum;

public class Solution {
	private static HashMap<Character, Character> hm = new HashMap<Character, Character>();
	 public int lengthOfLongestSubstring(String s) {
		 char[] stringToChar = s.toLowerCase().toCharArray();
		 int longestString = 0;
		 char startOfSubstring = ' ';
		 if (s==null) {
			 return -1;
		 } else if (s=="") {
			 return longestString;
		 } else {
			 for (int i = 0; i<stringToChar.length; i++) {
				 if (hm.containsKey(stringToChar[i])) {
					 char newStartPoint = removeSubstringLink(hm, stringToChar[i]); 
					 startOfSubstring = newStartPoint;
					 if (i+1<stringToChar.length) {
						 hm.put(stringToChar[i],stringToChar[i+1]);
					 } else {
						 hm.put(stringToChar[i],' ');
					 }
					 // abcdefagf
					 System.out.println(hm.toString());
					 int newLength = calculateLength(hm, startOfSubstring);
					 longestString = Math.max(longestString,newLength);
					 
				 } else {
					 if (i+1<stringToChar.length) {
						 hm.put(stringToChar[i],stringToChar[i+1]);
					 } else {
						 hm.put(stringToChar[i],' ');
					 }
				 }
				 
				 if (startOfSubstring==' ') {
					 startOfSubstring = stringToChar[i];
				 }
			 }
		 }
		 
		 int newLength = calculateLength(hm, startOfSubstring);
		 longestString = Math.max(longestString,newLength);
		 return longestString;
    }
	 
	 private char removeSubstringLink(HashMap<Character, Character> hm, char pointBeforeNewStart) {
		 char nextChar = hm.get(pointBeforeNewStart);
		 hm.remove(pointBeforeNewStart);
		 System.out.println(nextChar);
		 return nextChar;
	 }
	 
	 private int calculateLength(HashMap<Character, Character> hm, char start) {
		 int length = 1;
		 char thisChar = start;
		 char nextChar;
		 System.out.println("The thisChar value is:" + hm.containsKey(thisChar));
		 while (true) {
			 nextChar = hm.get(thisChar);
			 if (nextChar!=' ') {
				 length++;
				 thisChar = nextChar;
			 } else {
				 break;
			 }
		 }
		 return length;
	 }
	 
	 /**
		 * @param args
		 */
	public static void main(String[] args) {
		Solution s = new Solution();
		String test = "dvdf";
		int ans = s.lengthOfLongestSubstring(test);
		System.out.println(ans);
		///
	}
}
