import java.util.Scanner;

public class IT24103525Lab6Q2C
{
    public static void main(String[]args) 
  { 
      //create a scanner object to read inputs
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter 10 numbers: ");
      
      System.out.print("\nEnter Number 1: " );
      //Reading user input
      int number1 = input.nextInt();

      System.out.print("Enter Number 2: " );
      int number2 = input.nextInt();	

      System.out.print("Enter Number 3: " );
      int number3 = input.nextInt();

      System.out.print("Enter Number 4: " );
      int number4 = input.nextInt();

      System.out.print("Enter Number 5: " );
      int number5 = input.nextInt();

      System.out.print("Enter Number 6: " );
      int number6 = input.nextInt();

      System.out.print("Enter Number 7: " );
      int number7 = input.nextInt();

      System.out.print("Enter Number 8: " );
      int number8 = input.nextInt();

      System.out.print("Enter Number 9: " );
      int number9 = input.nextInt();

      System.out.print("Enter Number 10: " );
      int number10 = input.nextInt();

      System.out.println("\nThe Numbers you entered are: ");
      System.out.print(number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+number6+" "+number7+" "+number8+" "+number9+" "+number10+"\n");
     
     double tot=number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
     double avg=tot/10;      

     System.out.print("\nSum of the numbers: "+tot);
     System.out.print("\nAverage of the numbers: "+avg);

  }

}
