import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    // Q: Find the nth fibonacci number 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int p = 0;
    int i = 1;
    int count = 2;
    while(count <= n){
      int temp = i;
      i = i+p;
      p = temp;
      count ++;
    }
    System.out.println(i);
    in.close();
  }
}
