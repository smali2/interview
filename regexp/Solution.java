package com.google.interview.regexp;

public class Solution {
	public boolean isMatch(String s, String p) {
		if (s.length()==0) return false;
		
		if (p.length()==0) return (s.length()==0);
		
		if ((p.charAt(0)!='*')) {
			if ((p.charAt(0)!='.')) {
				if (s.charAt(0)==p.charAt(0)) {
					return isMatch(s.substring(1),p.substring(1));
				}
			}
			
			return isMatch(s.substring(1),p.substring(1));
		}
		
		
    }
}
