package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//  int i = scanner.nextInt(); //int 값을 입력 받아서 가져와
//  System.out.println(i);
//
    String s = scanner.nextLine(); //문자로 받기
    int i2 = Integer.parseInt(s);  //숫자로 변환
    System.out.println(i2);

    int a =1_000_000;
    int b =2_000_000;
    long c = a*(long)b;
    System.out.println(c);


    double res = 5/0.0;
    double r = 5%0.0;
    boolean b1 =Double.isInfinite(res);
    boolean b2 =Double.isNaN(r);
    System.out.println("res = " + res);;
    System.out.println("r = " + r);
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);

    int h = 5/0;//컴파일 오류에 안잡힘.


  }
}
