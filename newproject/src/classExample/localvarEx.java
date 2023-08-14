package classExample;

public class localvarEx {
  public static void main(String[] args) {
    int a = 2; // 지역변수 꼭 초기화 해주어야 한다.
    double b = 0.0;
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    for(int i=0; i<2 ; i++){
      int c =1;
      System.out.println("c = " + c);

    }
    //System.out.println("c = " + c); - for 밖으로 나오니까 안되므.

  }
}
