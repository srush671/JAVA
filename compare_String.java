import java.util.*;

class compare_String
  {
    String s1,s2;
    Scanner sc=new Scanner(System.in);
    
    void get()
     {
        System.out.println("Enter Two Strings:");
        s1=sc.next();
        s2=sc.next();
     }
    void compare()
     {
       System.out.println(s1.equals(s2));
     }
   public static void main(String args[])
   {
      compare_String s=new compare_String();
      s.get();
      s.compare();
   }
}
    

        
    