public class countingOccurrences {
  public static void main(String[] args) {
    long n = 541665656463L;
    int count = 0;
    while(n > 0){
      long rem = (int)(n%10);
      if(rem == 6){
        count++;
      }
      n = n/10;
    }
    System.out.println(count);
  }
}
