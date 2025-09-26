package com.pluralsight;

import java.util.Scanner;

public class MethodMiniExercises {
    public static void main(String[] args){
        printWelcome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        displayPlayerName(name);
        showLevel(1);
        showLevel(2);
        attack("Python", "students");
        attack("Java", "teachers");
        foundItem("Prince", "sword");
        foundItem("Nat", "shield");
        foundItem("Koi", "pizza");
        castSpell("Harry", "fireball", 5);
        castSpell("Ron", "healing spell", 10);
        gameOver("Prince");
        displayInventory("Prince", 87);
        enterDungeon("Prince", "Layer");
        enterDungeon("Prince", "Castle");
        victoryDance("Prince");
    }
    public static void printWelcome() {
        System.out.println("Welcome to Code Quest!");
    }
    public static void displayPlayerName(String name) {
        System.out.println("Player joined:" + name);
    }
    public static void showLevel(int level) {
        System.out.println("Level:" + level);
    }
    public static void attack(String attacker, String target) {
        System.out.println(attacker + " " + "attacks" + " " + target + "!");
    }
    public static void foundItem(String player, String item) {
        System.out.println(player + " " + "found a" + " " + item);
    }
    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " " + "casts" + " " + spellName + " " + "costing" + " " + manaCost + " " + "mana!");
    }
    public static void gameOver(String player){
        System.out.println("GAME OVER for" + " " + player);
    }
    public static void displayInventory(String player, int itemCount){
        System.out.println(player + " " + "has" + " " + itemCount +  " " + "items in inventory.");
    }
    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " " + "bravely enters the" + " " + dungeonName + ".");
    }
    public static void victoryDance(String player){
        System.out.println(player + " " + "does a little victory dance!");
    }
}
