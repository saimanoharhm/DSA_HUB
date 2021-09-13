package First;

import java.util.Scanner;
public class First{
  public static void main(String[] args) {
    // System.out.println();
    // int rollno = 64;
    // char letter = 'r';
    // float marks = 98.45f;
    // double largeDecimalNumbers = 4555666.455454;
    // long largeInteger = 45545515521551515L;
    // boolean check = false; 
    // Scanner sc = new Scanner(System.in);
    // int rollno = sc.nextInt();
    // System.out.println("Your roll number is: "+rollno);
    // sc.close();
    // byte b = 42;
    // char c = 'a';
    // short s = 1024;
    // int i = 500;
    // float f = 5.69f;
    // double d = 0.123;
    // double result = (f*b)+(i/c)-(d-s);
    // // float + int - double = double
    // System.out.println((f*b)+" "+(i/c)+" "+(d*s));
    // System.out.println(result);

    // // While loop 
    // int count = 1 ;
    // while(count < 5){
    //   System.out.println(count);
    //   count++;
    // }
    
    // // For loop 
    // for(int count1 = 1;count1 !=5;count1++){
    //   System.out.println(count1);
    // }

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter temp in C: ");
    float tempC = input.nextFloat();
    float tempF = (tempC * 9/5) + 32;
    System.out.println(tempF);
  }
}
