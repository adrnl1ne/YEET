package day1.quit;

import java.util.Scanner;

public class LoopTillQuit {
  Scanner input = new Scanner(System.in);
  private String in;
  private boolean isRunning = true;

  public void loopTillQuit() {
    greetUser();
    loop();
  }

  public void greetUser() {
    System.out.println("Enter text: (\"quit\" to quit)");
  }

  public String getUserInput() {
    return input.nextLine();
  }

  public void readUserInput() {
    in = getUserInput();
  }

  public void displayText() {
    System.out.println(in);
  }

  public void checkForQuit() {
    if (in.equalsIgnoreCase("quit")) {
      isRunning = false;
    }
  }


  public void loop() {
    while (isRunning) {
      readUserInput();
      checkForQuit();
      displayText();
      greetUser();
    }
  }

}
