import java.util.*;

public  class AreaCir{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println("The Area Of Circle Is:"+area);
    }
}