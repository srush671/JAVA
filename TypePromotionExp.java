public class TypePromotionExp{
    public static void main(String args[]){
        char a='a';
        char b='b';

        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(b-a);

        /* 1.Type Promotion Is Done Only In Expression
           2.byte,short,char--> into int
           3.Can Only Be Converted into Largest possible DataType
           */

    }
}