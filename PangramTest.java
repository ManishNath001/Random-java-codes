import java.io.*;

public class PangramTest 
{
     static int array_increment(String str, int len, int [] ar)
    {
        char ch;
        int n,m;
        for(int i=0; i<=len-1; i++)
        {
            ch=str.charAt(i);
            n=(int)ch;
            m=n-65;
            ar[m]=ar[m]+1;
        }
        return ar;
    }

    static int check(int [] ar, int len)
    {
        int a=0;
        for(int j=0; j<=len-1; j++)
        {
            if(ar[j]==0)
            {
                a=a+1;
            }
        }
        return a;
    }

    public static void main(String args[]) throws IOException
    {
        String str,s;
        int len, ar[], a;
        
        BufferedReader br=new BufferedReader(InputStreamReader(System.in));
        System.out.println("Enter the String:");
        s=br.readLine();
        str=s.toUpperCase();
        len=str.length();
        ar=new int[len-1];

        if(len>=26)
        {
           int [] arr=array_increment(str, len, ar);
            a=check(arr, len);
            if(a==0)
            {
                System.out.println("It is Pangram.");
            }
            else
            {
                System.out.println("It is not a Pangram.");
            }
        }
        else
        {
            System.out.println("It is not a Pangram.");
        }
    }
    
}
