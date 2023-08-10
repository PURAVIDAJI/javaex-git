package control;

import java.util.Scanner;

public class Multiif {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("점수를 입력하세요(0~100)");
    int score = scanner.nextInt();
    String grade ="";
    if(score>=90){
      if(score>=95){
        grade = "A+";
      } else {
        grade = "A-";
      }
    }
    else if (score>=80) {
      if(score>=85){
        grade = "B+";
      } else {
        grade = "B-";
      }

    } else if (score>=70) {
      grade = "C";
    }
    else if (score>=60) {
      grade = "D";
    }
    else{
      grade = "F";
    }
    System.out.println("당신의 학점은 " +grade);
  }

}
