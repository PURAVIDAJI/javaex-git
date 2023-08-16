package chapter05;

import java.util.Scanner;

public class problem5 {

  public static void main(String[] args) {
    int[] num = new int[10];
    int sum = 0;
    int number=0;
    int mok = 0;

    System.out.println("정수를 10개 입력하세요!");
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < num.length; i++) {
      number = scanner.nextInt();
      if (number>=0&& number<100)
      { mok =number%10;
        num[mok]++;
      }

    String s = "";
    for (int i1= 0; i1 < 10; i1++) {
      for (int j = 0; j < num[i1]; j++) {
        s+="*";
        System.out.println(i1 + "0" + "~" + i1 + "9:" + s);
      }
    }
      }
    }
  }
