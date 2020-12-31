package com.google.interview.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    
    public int compare(Player a0, Player b0) {
        Player a = (Player) a0;
        Player b = (Player) b0;
        //System.out.println(a.score - b.score);
        if (a.score - b.score==0) {
            return a.name.compareTo(b.name);
        } else {
            return a.score - b.score;
        }
    }
    
    public static void main(String[] args) {
        //
    }
    
}
