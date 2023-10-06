import java.util.*;

public class LinearSearch{
    Scanner sc=new Scanner(System.in);
    public static int SearchElement(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,8,10};
        int key=10;

        int index=SearchElement(numbers,key);

        if(index==-1){
            System.out.println("Not Fount");
        }
        else{
            System.out.println("Key is at index:"+index);
        }
    }
}