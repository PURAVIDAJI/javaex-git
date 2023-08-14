package ClassEX2;

public class SingletonTest {
  public static void main(String[] args) {

    //똑같은 애 하나가 공유 중이므로 각 싱글톤 인스턴스는 서로 같다.
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton1);
    System.out.println(singleton2);

    //생성자 프라이빗으로 > 각자 못만들게 막아두기
    //
  }
}