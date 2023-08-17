package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudents = 0;
    Grade grade; //벨류가 아니라 상수의 주소가 들어가야 함.
    Scanner sc = new Scanner(System.in);
    System.out.println("학생의 숫자를 입력하시오");
    numOfStudents = sc.nextInt();

    int[] score = new int[numOfStudents];
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("학생 점수를 입력하시요");
      score[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(score));
    for (int i = 0; i < score.length; i++) {
      if (score[i] >= 90) {
        grade = Grade.A;
      } else if (score[i] >= 80) {
        grade = Grade.B;
      } else {
        grade =Grade.C;
      }
      System.out.printf("%d 번째 학생의 점수는 %d, 등급은 %s %s이다", i + 1,score[i],grade, grade.getGrade());
//    }

    }

  }

}
