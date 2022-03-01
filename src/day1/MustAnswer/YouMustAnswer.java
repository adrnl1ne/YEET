package day1.MustAnswer;

import java.util.Scanner;

public class YouMustAnswer {
  Scanner input = new Scanner(System.in);
  private String in;

  public void youMustAnswer() {
    loop();
    printName();
  }

  public void greetUser() {
    System.out.print("Enter your name: ");
  }

  public String getUserInput() {
    return input.nextLine();
  }

  public void readUserInput() {
    in = getUserInput();
  }


  public void loop() {
    do {
      greetUser();
      readUserInput();
      checkForBlanc();
    }
    while (in.equals(""));
  }

  public void checkForBlanc() {
    if (in.equals("")) {
      System.out.println("You must enter your name!!");
    }
  }

  public void printName() {
    System.out.println("Thank you, " + in);
  }

}
