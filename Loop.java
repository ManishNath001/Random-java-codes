import java.util.*;
public class Loop
{
    public static void main (String args [])
    {
        int n,i,j,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of terms:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {              
                sum=(sum*10)+1;
                System.out.print(sum+" ");
            
        }
    }
}