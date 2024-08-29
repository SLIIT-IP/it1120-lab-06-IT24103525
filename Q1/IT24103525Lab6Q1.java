import java.util.Scanner;

public class IT24103525Lab6Q1 
{
    public static void main(String[]args) 
  { 
      //create a scanner object to read inputs
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      //Reading user input
      double number = input.nextDouble();
     
      //calculation & display final output
      System.out.println("\nThe square of "+number+" is : "+number*number);
      System.out.println("The square root of "+number+" is : "+Math.sqrt(number));

  }

}
 