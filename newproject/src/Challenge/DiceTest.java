package Challenge;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
//    System.out.println(d.num);
    for (int i = 0; i < 6; i++) {
      System.out.println(d.roll());
    }
  }
}