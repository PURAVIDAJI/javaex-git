package chapter05;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    //문자열 s에 포함된 문자 c의 개수를 반환하도록 이 메서도 구현
    String s = "";
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.println("문자열을 입력하세요");
    s = sc.nextLine();
    System.out.println("확인하고자 하는 문자를 입력하세요");
    c = sc.next().charAt(0);
    System.out.println(countChar(s, c));
  }

  static int countChar(String str, char ch){//static 꼭 써줘야함.
      int num=0;
      for (int i = 0; i < str.length(); i++) {
        if (str.toUpperCase().charAt(i)==Character.toUpperCase(ch)){
          num+=1;
        }
      }return num;


    }
  }
