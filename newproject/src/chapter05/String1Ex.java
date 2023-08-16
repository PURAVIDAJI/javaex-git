package chapter05;

public class String1Ex {
  public static void main(String[] args) {
    String s1;
    s1 = "안녕, 자바"; // 리터럴을 주는 것 처럼 보이지만 사실 "안녕, 자바"의 주소 할당 // 0x100
    //객체 만드려면 new String(); 안쓰고, 그냥 씀
    String s2 = "안녕, 자바"; //0x100

    String s3 =  new String("안녕");
    String s4 =  new String("안녕");
    //리터럴 값은 같지만 s3 != s4


    System.out.println(s1==s2);
    System.out.println(s1.equals(s2)); //둘 다 같게 나옴

    //할당 전
    System.out.println(s3==s4); //같은 객체야?
    System.out.println(s3.equals(s4)); //같은 리터럴값을 가지고 있어?

    //할당 후
    s3=s4;// 둘이 같다고 하면 같은 객체가 되어 버린다. //
    System.out.println(s3==s4); //같은 객체야?
    System.out.println(s3.equals(s4)); //같은 리터럴값을 가지고 있어?

    int i1 = 10;
    int i2 = 10;
    System.out.println(i1==i2);
    System.out.println(s1);

  }
}
