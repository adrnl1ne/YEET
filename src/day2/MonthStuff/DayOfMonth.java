package day2.MonthStuff;

import java.util.Scanner;

public class DayOfMonth {
  Scanner input = new Scanner(System.in);
  int in = 3;
  int year;
  int february;
  String month;

  public void dayOfMonth() {
    loop();
    unknownMonth();
  }

  public void unknownMonth() {
    System.out.println("Your entered month is unknown...");
  }

  public void greetUser() {
    System.out.println("Enter the wanted month (1-12):");
  }

  public void askForYear() {
    System.out.println("Enter the wanted year:");
  }

  public void findYear() {
    year = getUserInput();
  }

  public void decideIfWierdYear() {
    if (year % 4 == 0) {
      february = 29;
    } else {
      february = 28;
    }
  }

  public int getUserInput() {
    return input.nextInt();
  }

  public void readUserInput() {
    in = getUserInput();
  }

  public void decideMonth() {
    switch (in) {
      case 1 -> month = "January";
      case 2 -> month = "February";
      case 3 -> month = "March";
      case 4 -> month = "April";
      case 5 -> month = "May";
      case 6 -> month = "June";
      case 7 -> month = "July";
      case 8 -> month = "August";
      case 9 -> month = "September";
      case 10 -> month = "October";
      case 11 -> month = "November";
      case 12 -> month = "December";
    }
  }

  public void decideDaysOfMonth() {
    switch (in) {
      case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + " has 31 days");
      case 4, 6, 9, 11 -> System.out.println(month + " has 30 days");
      case 2 -> {
        askForYear();
        findYear();
        decideIfWierdYear();
        System.out.println(month + " has " + february + " days");
      }
    }
  }


  public void loop() {
    while (in >= 1 && in <= 12) {
      greetUser();
      readUserInput();
      decideMonth();
      decideDaysOfMonth();
    }
  }
}
