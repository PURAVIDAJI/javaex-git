package sample;

/**
 * Hello sample class
 * main-method
 * hello 출력하는 프로그램
 */
public class Hello {
  public static void main(String[] args) {

    var num =100;

    long i = 2_150_000_000L;
    double l = 3.14f; //float 실수이고 long 정수임.
    byte b =127;

   // b = num; // 왜 오류? 모호하면 다 싫음 언제 128이 될지 모름

    float f =(float)3.14;
    System.out.println(f);
    byte d =(byte)300; //값 손실 일어나는 거 알지만 감수하고 자를게
    System.out.println(d);

    char zero = 0;
    char three= 3 + '0';
    String str3 = 3.0 +"";
    //숫자로 변환
    double d3 = Double.parseDouble(str3);

    System.out.println(d3);

    double result = 7/(double)4; //계산되기 전에 형변환을 해야한다.
    System.out.println(result);

    System.out.printf("i = %d and d3 =%.1f\n", i, d3);

  }

}
