import java.io.*;
class New_Expt extends Exception
{
    private int exp;
    New_Expt(int s)
    {
        exp=s;
    }
    public String toString()
    {
        return "Invalid Sum";
    }
}

class Expt2
{
    static void compute(int a, int m)throws New_Expt
    {
        int s=a+m;
        if(s<0)
            throw new New_Expt(s);
        System.out.println("Sum Greater than 0.");
    }
    public static void main(String args[])throws IOException
    {
        int c,b;
        System.out.println("Name-Manish Nath, Makaut roll-14800119063.");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number:");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number:");
        c=Integer.parseInt(br.readLine());
        try
        {
            compute(b,c);
        }
        catch(New_Expt e)
        {
            System.out.println(e);
        }
    }
}
