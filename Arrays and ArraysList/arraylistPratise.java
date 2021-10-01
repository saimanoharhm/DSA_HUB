import java.util.*;

public class arraylistPratise {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // ArrayList<Integer> list = new ArrayList<>(10);
    // // list.add(67);
    // // list.add(78);
    // // list.add(4);
    // // list.add(257);
    // // list.add(62);
    // // list.add(6);
    // // list.add(27);
    // // list.add(7);
    // // list.add(67);
    // // list.add(57);
    // // list.add(61);
    // // list.add(62);
    // // System.out.println(list.contains(62));
    // // System.out.println(list);
    // // list.set(0,99);
    // // list.remove(2);
    // // System.out.println(list);

    // // input
    // for(int i=0; i<5; i++){
    //   list.add(in.nextInt());
    // }

    // //get item at any index
    // for(int i=0;i <5;i++){
    //   System.out.println(list.get(i));
    // }

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // initialisation
    for(int i=0; i<3;i++){
      list.add(new ArrayList<>());
    }

    //add elements
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        list.get(i).add(in.nextInt());
      }
    }
    in.close();

    //output 
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();
    }
  }
}
