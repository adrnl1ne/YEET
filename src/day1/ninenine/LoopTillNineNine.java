package day1.ninenine;

import java.util.Scanner;

public class LoopTillNineNine {
  Scanner input = new Scanner(System.in);
  private int in = 0;

  public void loopTillNineNine() {
    greetUser();
    loop();
    farewell();
  }

  public void getUserInput() {
    in = input.nextInt();
  }


  public void greetUser() {
    System.out.println("Enter a number (99 to quit)");
  }

  public void displayInput() {
    System.out.println(in);
  }

  public void farewell() {
    System.out.println("Have a nice day!!");
  }

  public void loop() {
    while (in != 99) {
      getUserInput();
      displayInput();
      greetUser();
    }
  }

}
