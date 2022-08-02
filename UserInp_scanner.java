import java.util.*;
public class UserInp_scanner 
{
    public static void main(String[] args)
    {
        int a;
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=obj1.nextInt();
        System.out.println("Entered number="+a);
    }    
}
