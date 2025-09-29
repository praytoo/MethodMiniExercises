package com.pluralsight;

import java.util.Scanner;

public class MethodMiniExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getPlayerTitle("Prince");
        System.out.println(getPlayerTitle("Prince"));
        doubleXP(5);
        if (hasLeveledUp(10, 90)) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding...");
        }
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);
        int damage1 = calculateDamage(150, 300);
        canOpenChest(true, true);
        canOpenChest(false, false);
        canOpenChest(false, true);
        canOpenChest(true, false);
        System.out.println("Pick a number between 1, 2, and 3");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1){
            System.out.println("Warrior");
        }else if (choice == 2){
            System.out.println("Mage");
        }else if (choice == 3){
            System.out.println("Rogue");
        }else {
            System.out.println("Peasant");
        }
        addGold(1000,5000);
        isQuestComplete(9, 10);
        int tasksDone = 9;
        int totalTasks = 10;
        if (tasksDone == totalTasks){
            System.out.println("Quest Complete!");
        }else{
            System.out.println("You still have work to do.");
        }
        isBossDefeated(87, -5, true);
        isBossDefeated(150, -52, false);
        int playerHP = 87;
        int bossHP = -5;
        boolean usedPotion = true;
        if (bossHP <= 0){
            System.out.println("Boss defeated!");
        }else if (playerHP <= 0 && !usedPotion){
            System.out.println("Player defeated");
        }else if (usedPotion){
            playerHP = playerHP + 50;
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
        if (currentXP >= threshold) {
            return true;
        } else {
            return false;
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int calculateDamage(int strength, int enemyDefense) {
        int damage = (strength * 2) - enemyDefense;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(damage);
        return damage;
    }

    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        if (hasKey || lockIsBroken) {
            System.out.println("can open chest");
        } else {
            System.out.println("can't open chest");
        }
        return true;
    }

    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            System.out.println("Warrior");
        } else if (choice == 2){
            System.out.println("Mage");
        }else if (choice == 3){
            System.out.println("Rogue");
        } else {
            System.out.println("Peasant");
    }
        return " ";
    }
    public static int addGold(int currentGold, int goldFound) {
        if (goldFound > 100) ;
        double tax = (.10 * goldFound);
        double finalGold = currentGold + goldFound - tax;
        System.out.println("Final amount of gold:" + " " + finalGold);
        return currentGold;
    }
    public static boolean isQuestComplete(int tasksDone, int totalTasks){
     if (tasksDone == totalTasks);
     return true;
    }
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion){
     if (bossHP <= 0){
         return true;
     }else if (playerHP <= 0 && !usedPotion){
         return false;
     }else if (usedPotion){
         return playerHP + 50 > bossHP;
     }
        return usedPotion;
    }}
