package chapter05;

public class ArrayStringEx {
  public static void main(String[] args) {
    String[] names= new String[3]; //3개의 참조변수를 원소로 가지는 배열 선언
    for (String nm: names) {
      System.out.println(nm);
    }
    names[0] = "kim";
    names[1] = "Lee";
    names[2] = "park";
    for (String nm: names) {
      System.out.println(nm);
    }
  }
}
