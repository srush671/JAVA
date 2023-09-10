import java.util.*;

 class ArmstrongNumber 
{
   public static void main(String args[]) 
     {
       Scanner sc = new Scanner(System.in);
      
      int number,temp, rem, sum = 0;

      System.out.println("Enter the number :");
      number = sc.nextInt();

      temp = number;
      while(temp != 0) 
      {
         rem = temp % 10;
         sum = sum + (rem * rem * rem);
         temp= temp / 10;
      }

      if(sum == number)
         System.out.println("Given number is an armstrong number.");
      else
         System.out.println("Given number is not an armstrong number.");
   }
}