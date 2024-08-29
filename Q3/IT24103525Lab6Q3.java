import java.util.Scanner;

public class IT24103525Lab6Q3
{
    public static void main(String[]args)
  {   
   
    int number=0;
    double x=0;
    double tot = 0;
    int count=0;

    //create a scanner object to read inputs
    Scanner input = new Scanner(System.in);

    System.out.println("Enter positive integers (terminate input with -99) ");

    while (true)
     {
       System.out.print("Enter a number: ");
       //Reading user input
       number = input.nextInt();

      if (number == -99) 
	{
         break;
        }
     
       if(number>0)
    	{
   	  x = Math.pow(number,2);
          tot+=x;
          count++; 
	}

       else
        {
         System.out.println("Invalid input. Please enter a positive number or -99 to terminate");
	}

     }

    double Rms = Math.sqrt(tot/count);

    System.out.println("\nThe Root Mean Square (RMS) is:"+Rms);

  }

}
