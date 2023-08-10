package sample;

public class OperatorEx {
  public static void main(String[] args) {
    int i =0;
    //++i 먼저 더한 후 j 값에 넣자
    int j = ++i;

    System.out.printf("i = %d and j= %d ",i,j);

    int l=0;
    int m= l++;
    // l++ 먼저 참조한 후에 나중에 더해라.
    System.out.printf("l = %d and m= %d ",l,m);

  }
}
