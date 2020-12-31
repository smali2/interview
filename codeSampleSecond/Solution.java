package com.google.interview.codeSampleSecond;

import java.util.HashMap;

// suppose there is a directory structure like this 
// dir
//  /file.jpg
//  /dir12
// dir2
//  /file1.gif
// and the input string S is like : "\dir\n \file.jpg\n \dir12\n\dir2\n \file1.gif
// return the file path for any picture file that is the longest in CHARACTERS 
// e.g. dir2/file1.gif is the longest file path since it has most number of chars

class Solution {
	
	public static final String[] EXTENSIONS = {".jpeg", ".png", ".gif"};
	
	// make a trie to save the data
	class Node {
		HashMap<String, Node> children = new HashMap<>();
		boolean isFile = false;
		String name;
		
		public Node(String n) {
			name = n;
		}
	}
    public int solution(String S) {
        //S = S.replace('\n', ' ');
        String[] dirs = S.split("\n");
        
        Node headNode = new Node("");
        Node traverseNode = headNode;
        
        // count number of indents
        int indent = 0;
        int j = 1;
        for (String s : dirs) {
        	int i = 0;
        	while (s.charAt(i)!=' ') {
        		i++;
        	}
        	
        	while (i<=indent) {
        		
	        	if (i==indent) {
	        		headNode.children.put(s.substring(i), new Node(s.substring(i)));
	        	} 
	        	i
        	}
        	
        }
        
        
        
        
        
    	
    }
}
