import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class functionsPractise {
  public static void main(String[] args) {
    // int ans = sum2();
    // System.out.println(ans);
    fun(2,4,56,7,8,9,4,5,4);
  }
  //return the value
//   static int sum2(){
//     Scanner in = new Scanner(System.in);
//     int num1,num2,sum;
//     System.out.println("Enter number 1: ");
//     num1 = in.nextInt();
//     System.out.println("Enter number 2: ");
//     num2 = in.nextInt();
//     sum = num1+num2;
//     return sum;
//   }

//   static void Sum(){
//     Scanner in = new Scanner(System.in);
//     int num1,num2,sum;
//     System.out.println("Enter number 1: ");
//     num1 = in.nextInt();
//     System.out.println("Enter number 2: ");
//     num2 = in.nextInt();
//     sum = num1+num2;
//     System.out.println("The sum is: "+sum);
//     in.close();
//   }
  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }
}
