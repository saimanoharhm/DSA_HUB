import java.util.*;
public class arraysPractise {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int[] arr = new int[5];
    // arr[0] = 5;
    // arr[1] = 4;
    // arr[2] = 4;
    // arr[3] = 7;
    // arr[4] = 9;
    // System.out.println(arr[3]);

    // // input using for loops
    // for(int i=0; i< arr.length;i++){
    //   arr[i] = in.nextInt();
    // }
    // for(int i=0; i< arr.length;i++){
    //   System.out.println(arr[i]);
    // }
    // for (int num : arr) { // for every element in array, print the element. 
    //   System.out.print(num+" "); // here num represents element of the array
    // }
    // System.out.println(Arrays.toString(arr));

    // array of objects
    // String[] str = new String[5];
    // for (int i=0; i<str.length; i++) {
    //   str[i] = in.next();
    // }
    // System.out.println(Arrays.toString(str));  

    // functions passing in arrays
    int[] nums = {2,4,5,6,7,7};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
    in.close();
  }
  static void change(int[] arr){
    arr[0] = 99;
  }
}
