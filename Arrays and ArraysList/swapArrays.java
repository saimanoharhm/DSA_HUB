import java.util.Arrays;

public class swapArrays {
  public static void main(String[] args) {
    int[] arr = {1,2,3,9,15};
    swap(arr,0,4);

    System.out.println(Arrays.toString(arr));
  }
  static void swap(int[] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
