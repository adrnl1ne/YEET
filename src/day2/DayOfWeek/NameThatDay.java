package day2.DayOfWeek;

import java.util.Scanner;

public class NameThatDay {
  Scanner input = new Scanner(System.in);
  int in = 3;

  public void nameThatDay() {
    loop();

  }

  public void greetUser() {
    System.out.println("Enter the day of week (1-7)");
  }

  public int getUserInput() {
    return input.nextInt();
  }

  public void readUserInput() {
    in = getUserInput();
  }

  public void decideDay() {
    switch (in) {
      case 1 -> System.out.println("I would call that Monday");
      case 2 -> System.out.println("I would call that Tuesday");
      case 3 -> System.out.println("It's Wednesday ma dudes");
      case 4 -> System.out.println("I would call that Thursday");
      case 5 -> System.out.println("It' Friday again");
      case 6 -> System.out.println("It's Saturday");
      case 7 -> System.out.println("Sunday, what?");
    }
  }

  public void loop() {
    while (in >= 1 && in <= 7) {
      greetUser();
      readUserInput();
      decideDay();
    }
  }
}
