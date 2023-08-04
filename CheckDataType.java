import java.util.*;
public class CheckDataType{
    public static void main(String args[]){
        int intData;
        char charData;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string value");
        String str=sc.nextLine();
        System.out.println("Enter Integer value");
        intData=sc.nextInt();
        System.out.println("Enter Character value");
        charData=sc.next().charAt(0);
        System.out.println(intData+"is of type"+((Object)intData).getClass().getSimpleName());
        System.out.println(charData+"is of type"+((Object)charData).getClass().getSimpleName());
        System.out.println(str+"is of type"+str.getClass().getSimpleName());
    }
}
