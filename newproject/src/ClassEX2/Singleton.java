package ClassEX2;

public class Singleton {

  static Singleton singleton = new Singleton();
  //static : 객체로 만들 지않고 클래스만 있어도 바깥에서 new로 만들지 않아도 사용 가능.

  //생성자
  private Singleton(){ //외부에서 지들 맘대로 쓸 수 없기에

  }
//싱글톤 남한테 보내기!
  static Singleton getInstance() {
    return singleton;
  }
}
