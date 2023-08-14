package classExample;

public class Animal_Test {
  public static void main(String[] args) {
    Object obj =new Object();//생성자임
    Bird bird =null;
    System.out.println("bird = " + bird);
    bird/*3*/ = new Bird();/*2*/
    System.out.println("bird = " + bird);
    //1. 참조 변수 선언 > 객체가 생성되지 않음 (무)
    //2. 객체를 힙 영역에 생성.버드를 생성한다. -> .이 참조
    //3. 주소를 bird에 할당한다. ->.은 그 주소를 참조하는 것으로 주소 밑으로 들어간 메쏘드를 사용할 수 있음.

    bird.breath();
    bird.move();
    Tiger tiger = new Tiger();
    System.out.println("tiger = " + tiger);
    //tiger.run();
    tiger.eat();
    tiger.move();
    Animal animal = new Animal();
    System.out.println("animal = " + animal);
    animal.move();
    Fish fish = new Fish();
    System.out.println("fish = " + fish);
    fish.move();
  }
}
