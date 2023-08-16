package chapter05;

import java.util.Scanner;

public class Array1Demo {
  //5개의 과목 점수를 입력받아 배열에 저장
  // 배열에 들어가 있는 점수의 총합과 평균을 구하라
  public static void main(String[] args) {
    int[] score = new int[5];
    int sum=0;
    float avg=0.0f;
    System.out.println("과목의 점수를 입력하세요");
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < score.length; i++) {
      score[i] = scanner.nextInt();
    }

    for (int i = 0; i < score.length ; i++) {
      sum+=score[i];
    }
    avg = sum/ (float)score.length;
    System.out.println(sum);
    System.out.printf("avg = %.1f" ,avg);
  }
}
