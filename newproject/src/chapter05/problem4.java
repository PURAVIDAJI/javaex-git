package chapter05;

import java.util.Scanner;

public class problem4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("URL을 입력하세요");
    String url =sc.nextLine();
    if (url.equalsIgnoreCase("bye")){return;
    }
    if (url.toLowerCase().endsWith("com")){
      System.out.println(url+"은 'com'으로 끝납니다.");
    }
    if (url.toLowerCase().contains("java")){
      System.out.println(url+"은 'java'를 포함합니다.");
    }
  }
}
