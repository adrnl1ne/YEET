package day3.FridgeFun;

import java.util.Scanner;

public class FridgeFun {
  Scanner input = new Scanner(System.in);
  int numFoods;
  String[] foods = new String[25];


  public void fridgeFun() {
    numFoods = askAmountFoods();
    foods = askForInputFoods(numFoods);
    printList(foods);
  }


  String[] askForInputFoods(int num) {
    String[] inputFoods = new String[num];

    for (int i = 0; i < num; i++) {
      System.out.print("Enter food #" + (i + 1) + ": ");
      inputFoods[i] = input.nextLine();
    }
    return inputFoods;
  }


  public int askAmountFoods() {
    System.out.println("How many foods do you want to buy?");
    numFoods = input.nextInt();
    input.nextLine();
    return numFoods;
  }

  public void printList(String[] foods) {
    System.out.println("\nLIST OF FOODS:");

    for (int i = 0; i < foods.length; i++) {
      System.out.println("#" + (i + 1) + ": " + foods[i]);
    }
  }


}
