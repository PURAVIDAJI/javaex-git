package ClassEX2;

public class PersonTest1 {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayhello();//연속 호출 (chain Method)

    Person p2  = new Person();
    p2.setName("대한").setAge(20).sayhello();


  }
}
