package com.google.interview.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
    	int n = 4;
        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        Player a = new Player("Ali", 20);
        Player b = new Player("Fizza", 19);
        Player c = new Player("Semra", 200);
        Player d = new Player("Hamza", 200);
        player[0] = a;
        player[1]= b;
        player[2] = c;
        player[3]= d;
        //for(int i = 0; i < n; i++){
        //    player[i] = new Player(scan.next(), scan.nextInt());
        //}
        //scan.close();
        
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

