import java.io.*;
public class UserInp_BR 
{
    public static void main(String[] args)throws IOException
    {
        int a;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number:");
        a=Integer.parseInt(br.readLine());
        System.out.print("Entered Number="+a);
    }   
}
