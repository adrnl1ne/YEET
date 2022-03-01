package day3.Arrays;

public class Arrays {
  int total = 0;
  int[] refuel = new int[4];

  public void arrays() {
    data();
    loopsNShit();
  }


  public void data() {
    refuel[0] = 23;
    refuel[1] = 38;
    refuel[2] = 4;
    refuel[3] = 40;
  }

  public void loopsNShit() {
    for (int i = 0; i < 4; i++)
      System.out.printf("Week %d: %d litres\n", i, refuel[i]);

    for (int i = 0; i < refuel.length; i++)
      total += refuel[i];
    System.out.println("Total. " + total);
  }
}
