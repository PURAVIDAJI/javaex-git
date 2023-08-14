package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    //생성자 만들어 질때 그냥 변수까지 넣어서 사용하고 싶으면!!??
    Phone myPhone = new Phone("Galaxy23",1_000_000);
    System.out.println(Phone.getNumberOfPhones()+"대가 생성되었습니다.");
    myPhone.print();
    myPhone.getNumberOfPhones();

    Phone yourPhone = new Phone("iPhone15",1_200_000);
    System.out.println(Phone.getNumberOfPhones()+"대가 생성되었습니다.");
    yourPhone.print();
    System.out.println(yourPhone.getNumberOfPhones() +"대 생성");
    System.out.println(myPhone.getNumberOfPhones() +"대 생성");
    //클래스 정보 하나를 공유하고 있음.


  }
}
