package day1.Sdrawkcab;


import java.util.Locale;
import java.util.Scanner;

public class SdrawkcabEman {
  Scanner input = new Scanner(System.in);
  private String in;
  private String reverse = "";

  public void sdrawkcabEman() {
    loop();
    printNameBackwards();
  }

  public void greetUser() {
    System.out.print("Please enter your name: ");
  }

  public String getUserInput() {
    return input.nextLine();
  }

  public void readUserInput() {
    in = getUserInput();
  }

  public void checker() {
    if (in.equals("")) {
      System.out.println("It seems you haven't entered anything!");
    }
  }

  public void loop() {
    do {
      greetUser();
      readUserInput();
      checker();
      backwardsGenerator();
    }
    while (in.equals(""));
  }

  public void backwardsGenerator() {
    for (int i = in.length() - 1; i >= 0; i--) {
      reverse = reverse +  in.charAt(i);
    }
  }

  public void printNameBackwards() {
    System.out.println("I think i got your name backwards, " + reverse.toUpperCase(Locale.ROOT));
  }
}

