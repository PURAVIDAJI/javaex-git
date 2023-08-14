package classExample;

public class Phone {

  //class 변수 필요 > 이 클라스 가지고 몇개의 핸드폰 만들었는지 알기 위함
  private static long numberOfPhones;
  String model; //필드 선언
  int value;
  //생성자 만들기

  //  public Phone(){}
  //값 받아와서 하고 싶으면? (생성자 오버로딩)
  public Phone(String model, int value){
    this.model = model;
    this.value = value;
    numberOfPhones++;
  }

  public static long getNumberOfPhones() {
    return numberOfPhones;
  }

  //정보 출력 메소드
  void print(){
    System.out.println(value+"원 짜리 "+ model+"의 스마트폰임.");
  }
}
