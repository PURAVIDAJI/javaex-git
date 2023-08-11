package control;

import java.util.Scanner;
public class WhileEx3 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String bio = "", kind = "";

    while (true) {
      System.out.println("동물의 이름 입력하세요");
      bio = in.next();
      if (bio.equals("종료"))
        break;
      switch (bio) {
        case "호랑이", "사자" -> kind = "포유류";
        case "독수리", "참새" -> kind = "조류";
        default -> kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다.\n", bio, kind);
    }
  }
}

