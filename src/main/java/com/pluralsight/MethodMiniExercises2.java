package com.pluralsight;

import java.util.Scanner;

public class MethodMiniExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getPlayerTitle("Prince");
        System.out.println(getPlayerTitle("Prince"));
        doubleXP(5);
        if (hasLeveledUp(10, 90)){
            System.out.println("You leveled up!");
        }else {
            System.out.println("Keep grinding...");
        }
    }
    public static String getPlayerTitle(String name) {
        return "Lord" + " " + name;
    }
    public static int doubleXP(int xp) {
        System.out.println("original xp:" + " " + xp + " " + "doubled xp:" + " " + xp * 2);
        return xp;
    }
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        if (currentXP >= threshold){
            return true;
        } else {
            return false;
        }
    }


}