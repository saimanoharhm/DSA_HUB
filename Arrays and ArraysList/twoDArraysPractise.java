import java.util.*;
public class twoDArraysPractise {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /* 
      1 2 3
      4 5 6
      7 8 9 
    */

    // int [][] arr = new int[3][3];
    
    int [][] arr1 = {
      {1,2,3,4}, // 0th index 
      {5,6}, // 1st index
      {7,8,9}  // 2nd index -> arr[2] = {6,7,8,9}
    };

    int [][] arr = new int[3][3];
    System.out.println("Length: "+arr.length); // no of rows

    // input
    for(int row = 0; row<arr.length; row++){
      // for each col in every row
      for(int col=0; col<arr[row].length; col++)
      {
        arr[row][col] = in.nextInt();
      }
    }

    // output
    for(int row = 0; row<arr.length; row++){
      // for each col in every row
      for(int col=0; col<arr[row].length; col++)
      {
        System.out.print(arr[row][col]+ " ");
      }
      System.out.println();
    }

    // output
    for(int row = 0; row<arr.length; row++){
      System.out.println(Arrays.toString(arr[row]));
    }

    for(int[] a: arr){
      System.out.println(Arrays.toString(a));
    }

    // Printing the dynamic arrays

    for(int row=0; row<arr1.length;row++){
      for(int col=0; col<arr1[row].length;col++){
        System.out.print(arr1[row][col]+ " ");
      }
      System.out.println();
    }

    in.close();
  }
}
