package Challenge;

public class MonthTest {
  public static void main(String[] args) {
    Month month =Month.Jul;
    //enum으로 된 Month 불러오는 것임.


    System.out.println(month.name());
    System.out.println(month.ordinal());
    System.out.println(month.getMonth());

  }
}
