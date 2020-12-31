package com.google.interview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int diff = target-nums[i];
            if (!diffs.containsKey(diff)) {
                diffs.put(nums[i], i);
            } else {
                return new int[]{diffs.get(diff),i};
            }
        }
        return new int[]{};
    }
	
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] test = {-3,4,3,90};
				
		int[] a = ts.twoSum(test, 1);
		System.out.println(Arrays.toString(a));
		///
	}
}
	