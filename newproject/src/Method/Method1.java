package Method;

public class Method1 {
  public static void main(String[] args) {

//    sum(1,10);
//    sum(10,100);

    System.out.printf("sum(1~10) = %d\n" ,sum(1,10));
    System.out.printf("sum(10~100) = %d\n" ,sum(10,100));
    System.out.printf("sum(100~1000) = %d\n" ,sum(1_000_000_000,2_000_000_000));
  }

  //동일하게 반복되지 않기에 중첩for문 불가! 그러면 어떻게 해야 하나?
  //메소드를 하나 만릉겠다.

  //출력하고 끝내는 경우
//  static void sum(int num1,int num2) {
//    int sum=0;
//    for (int i=num1; i<=num2;i++){
//      sum +=i;
//    }
//    System.out.printf("%d부터 %d까지의 합은 %d이다\n",num1,num2, sum);
//  }
//
  //리턴 해줄 때
  static long sum(long num1, long num2){
    long sum=0;
    for(long i=num1; i<=num2;i++){;
      sum+=i;
    }
    return sum;
  }
}
