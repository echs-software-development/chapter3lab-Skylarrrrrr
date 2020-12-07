import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");

    int number = scan.nextInt();
    
    if (number > 5 && number < 76)
      System.out.println("False");

    else
      System.out.println("True");


  }
  }