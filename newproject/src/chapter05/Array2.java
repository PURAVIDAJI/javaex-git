package chapter05;

import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {
    int[] arr2 ={1,2,3,4,5};
    for (int element:arr2) {
      System.out.println("element = " + element);
    }
    System.out.println(arr2);//배열에서 toString을 오버라이드 하지 않았기에 원하는 것처럼 안나옴.

    // Arrays 도움받아 찍기
    System.out.println(Arrays.toString(arr2));

    char[] cArr ={'a','b','c'};
    //String sArr = "abc";
    System.out.println(cArr);
    for (char c: cArr) {
      System.out.println(c);
    }
    System.out.println(cArr); //문자의 배열은 문자열이기에 String이 되므로 Array 도움없이도 찍을 수 있음! 주소가 나오는게 아니라 String이 나옴.
    System.out.println(Arrays.toString(cArr));



   }
}
