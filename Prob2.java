import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two integers:");

    int int1 = scan.nextInt();
    int int2 = scan.nextInt();

    if (int1 > 0 && int2 > 0)
      System.out.println("Both are positive or zero.");

    else
      System.out.println("One or both are negative.");

  }
  
  }