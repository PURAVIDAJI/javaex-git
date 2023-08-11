package classExample;

class Animal { //여기는 왜 public 안쓰는 가? -> default값으로 써서 필드 접근 제한자를 알려주기 위해서!


  void breath(){
    System.out.println("숨쉰다");

  }
  void eat(){
    System.out.println("먹는다");
  }
  void move(){
    System.out.println("움직인다");
  }

}
class Bird extends Animal{
  void swim(){
    System.out.println("헤엄친다");

  }

}

class Tiger extends Animal {

  void run() {
    System.out.println("달린다");

  }
}