import java.util.*;
import java.io.*;
public class PrimeNumbers
{
   public static void main(String arg[])
   {
      int i,n,counter, j;
      Scanner sc=new Scanner (System.in);

      System.out.printf("Enter the Range ");
      n=sc.nextInt();

      
      for(j=2;j<=n;j++)
       {
         counter=0;
         for(i=1;i<=j;i++)
          {
            if(j%i==0)
            {
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
   }
}