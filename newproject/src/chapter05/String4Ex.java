package chapter05;

public class String4Ex {
  public static void main(String[] args) {
    String java = String.format("%s %.1f","java",3.1469);
    System.out.println(java);
    String join=String.join("&","amor","amistad","generoso","lalalala");
    //문자열을 반환하는 구나.
    System.out.println(join);
    String s = String.valueOf(1_99999);
    System.out.println();

  }

}
