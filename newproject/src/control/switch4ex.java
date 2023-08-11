package control;

import java.util.Scanner;

public class switch4ex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    String bio = in.nextLine();
    String kind = switch (bio) {
        case "호랑이", "사자", "돌고래","침팬지","원숭이","인간" -> "포유류";
        case "참새","매미" -> "조류";
        case "고등어","연어","열대어" -> "어류";
      default -> "해당없음";
    };
    System.out.printf("%s는 %s이다",bio, kind);
    }
  }
