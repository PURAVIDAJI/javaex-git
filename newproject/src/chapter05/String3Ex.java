package chapter05;

public class String3Ex {
  public static void main(String[] args) {
    String s1 ="Hi, Java";
    String s2 ="!!!";
    System.out.println(s1.charAt(4));
    System.out.println(s1.concat(s2));
    String s3 =" ";
    String s4 ="";
    System.out.println("s3.isEmpty() =>"+s3.isEmpty()); //비어있는 문자열인지 확인하기!
    System.out.println("s4.isEmpty() =>"+s4.isEmpty());
    System.out.println("s3.isBlank() =>"+s3.isBlank());
    System.out.println("s3.isBlank() =>"+s3.isBlank());

    System.out.println(s1.toLowerCase()); //잠시 소문자로 변환해서 보여줌
    System.out.println(s1.toUpperCase()); //잠시 대문자로 변환해서 보여줌
    System.out.println(s1); //
    System.out.println(s1.substring(4));
    System.out.println(s1.substring(4,6));
    System.out.println(s1.length());

  }
}
