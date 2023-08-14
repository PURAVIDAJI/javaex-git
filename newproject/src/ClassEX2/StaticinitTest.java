package ClassEX2;

public class StaticinitTest {
  public static void main(String[] args) {
    System.out.println(Staticinit.sumOneToTen);
    //위에는 static이라서 객체 생성 안해도 불러올 수 있지만,
    //아래는 객체 생성을 해야만 불러올 수 잇다...!
    Staticinit staticinit = new Staticinit();
    System.out.println(staticinit.sumOneToTen2);


  }
}
class Staticinit{
  static int sumOneToTen ;
  int sumOneToTen2;
  static {
      int sum =0;
      for(int i=0; i<=10;i++){
        sum+=i;
      }
      sumOneToTen =sum;
  }

  {
    int sum =0;
    for(int i=0; i<=10;i++){
      sum+=i;
    }
    sumOneToTen2 =sum;
  }
}
