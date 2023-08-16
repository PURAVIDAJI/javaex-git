package chapter05;

public class ArrayEx {
  public static void main(String[] args) {
    //배열 선언
    //int[] scores =new int[3];
    int sum=0;
    int avg =0;

    int[] scores = {90,80,100};
    //int[] scores =new int[] {90,80,100};
    //int[] socres;//참조 변수 선언
    //scores = new int[] {90,80,100} //주소 넣어
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    avg = sum/ scores.length;
    System.out.println(sum);
    System.out.println(avg);
    //scores는 참조 변수이기에, 주소를 저장해야함.

    /*배열 더 키워주기*/
    int[] scoresBig = new int[5];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] =scores[i];
    }
    scores = scoresBig;
    scores[3] =88;
    scores[4] =99;

    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    for (int score : scores) {
      System.out.println(score);
    }



  }
}
