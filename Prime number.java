import java.util.*;

public class main{
  public static boolean isPrime(int n) {
    int count = 0;
    for(int i=1;i<=n;i++) {
      if(n % i == 0) {
        count++;
      }
    }
    if(count == 2 ){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPrime(n));
  }
}
