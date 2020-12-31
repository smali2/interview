/**
 * 
 */
package com.google.interview;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Ali
 *
 */
public class Solution {

	public int solution(int[] A) {
        // write your code in Java SE 8
		// current sum so far
		int sumSoFar = 0;
		int[] backSums = new int[A.length];
		int[] forwardSums = new int[A.length];
		
		backSums[0] = 0;
		for (int a = 0; a<A.length-1; a++) {
			sumSoFar += A[a];
			backSums[a+1] = sumSoFar;
		}
		
		
		sumSoFar = 0;
		forwardSums[A.length-1] = 0;
		for (int a = A.length-1; a>0; a--) {
			sumSoFar += A[a];
			forwardSums[a-1] = sumSoFar;
		}		
		
		
		for (int a = 0; a<A.length; a++) {
			if (backSums[a]==forwardSums[a]) {
				return a;
			}
		}
		
		return -1;
			
		
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] test = {1,2,1,3};
		s.solution(test);
		///
	}

}
