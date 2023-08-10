package control;

import java.util.Scanner;

public class WhileEx2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String kind = "";
    while(true){
      System.out.println("동물의 이름을 입력하세요");
      String bio = in.nextLine();
      if (bio.equals("종료")) {
        break;
      }

      if (bio.equals("호랑이")||bio.equals("사자")||bio.equals("돌고래")){
        kind = "포유류";
        System.out.printf("%s는 %s입니다.", bio, kind);
      }

      else if (bio.equals("독수리")||bio.equals("참새")||bio.equals("앵무새")){
        kind = "조류";
        System.out.printf("%s는 %s입니다.", bio, kind);
      }

      else if (bio.equals("연어")||bio.equals("구피")||bio.equals("열대어")){
        kind = "어류";
        System.out.printf("%s는 %s입니다.", bio, kind);
      }

      else{
        System.out.printf("입력하신 동물의 정보가 없습니다. 다시 입력하세요.");
      }
      }
    }
    }

