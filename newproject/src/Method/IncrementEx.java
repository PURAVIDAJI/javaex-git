package Method;

public class IncrementEx/*메소드 에이리어*/ {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("매서드 호출 전 x = " +x);
    increment(x);
    System.out.println("매서드 호출 후 x = "+x);


  }
  static void increment(int num){
    System.out.println("매서드 시작 num = " +num);
    num++;
    System.out.println("매서드 종료 num = " +num);
  }
}
