package Challenge;

public enum Month {
  Jan(1),Feb(2),Mar(3),Apr(4),May(5),June(6),Jul(7),Aug(8),
  Sep(9),Oct(10),Nob(11),Dec(12);

 //불러올때는 Month.Jan 이런식으로 불러오고,
 //뒤에 value값에 관해서 필드, 생성자, 메소드를 정의하는 것.
  private int month;
  //맘대로 고치면 안되니까 ()안의 값을 private으로 저장한다.

  /*생성자*/
  private Month(){};
  private Month(int month){
    this.month = month;
  }
  /*Getter메소드*/
  public int getMonth(){
    return month;
  }
}
