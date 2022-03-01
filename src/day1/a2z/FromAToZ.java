package day1.a2z;


public class FromAToZ {

  private String test;

  public void fromAToZ() {
    generateAlphabet();
    newLine();
    backwardsGenerator();
  }

  public void generateAlphabet() {
    for (char c = 'A'; c <= 'Z'; c++) {
      test = Character.toString(c);
      System.out.print(test);
    }
  }

  public void newLine() {
    System.out.println("");
  }

  public void backwardsGenerator() {
    for (char c = 'Z'; c >= 'A'; c--) {
      test = Character.toString(c);
      System.out.print(test);
    }
  }
}
