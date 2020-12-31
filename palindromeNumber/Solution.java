package com.google.interview.palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
        if (x>Integer.MIN_VALUE) {
			int pow = getPower(Math.abs(x), 0);
			System.out.println("Step 1: pow "+pow);
			int reverse = reverse(x);
			System.out.println("Step 2: reverse "+reverse);
			// Now divide x and reverse repeatedly while decrementing pow by 1 each time
			int quotient = 0;
			int rem = 0;
			for (int i = pow; i>pow/2;i--) {
				int multiple = (int) Math.pow(10, i);
				int test1 = reverse/multiple;
				int test2 =x/multiple;
				System.out.println("Testing: "+test1+","+test2);
				if (test1!=test2) {
					return false;
				}
			}
			return true;
        } 
        
        return false;
   
    }
	
	public int reverse(int x) {	
		// Get the max power	
        int pow = getPower(Math.abs(x), 0);
        // Reverse int
        long ans = reverseHelper(Math.abs(x), pow);
        if ((ans<Integer.MAX_VALUE) && (x>Integer.MIN_VALUE)) {
	        if (x<0) {
	        	return (int) (ans * -1);
	        } 
	        return (int) ans;
        } else {
        	return 0;
        }
    }
    
    private long reverseHelper(long x, int pow) {
        long rem = x % 10;
        long quotient = x / 10;
        if (quotient>0) {
            return (long) (rem * Math.pow(10,pow) + reverseHelper(quotient, pow-1));
        }
        return rem;
    }
    
    private int getPower(long x, int pow) {
        long quotient = x / 10;
        if (quotient>0) {
        	System.out.println("Int is "+x+" and pow is "+pow);
            return getPower(quotient, pow+1);
        } 
        System.out.println("Int is "+x+" and pow is "+pow);
        return pow;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.isPalindrome(-2147483648));
    	System.out.println(s.isPalindrome(1534236469));
    	System.out.println(s.isPalindrome(-12321));
    }
}
