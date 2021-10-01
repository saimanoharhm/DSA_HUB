public class maximumitemArray {
  public static void main(String[] args) {
    int[] arr = {1,3,4,57,5,7,9};
    System.out.println("Maximum value: "+maxRange(arr,1,3));
  }

  static int maxRange(int[] arr, int start, int end){
    int maxVal = arr[0];
    for(int i=start; i<=end; i++){
      if(arr[i] > maxVal){
        maxVal = arr[i];
      }
    }
    return maxVal;
  }

  static int max(int[] arr){
    int maxVal = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i] > maxVal){
        maxVal = arr[i];
      }
    }
    return maxVal;
  }
}
