import java.io.*;

class Stringrev
{
    public static void main(String args[])throws IOException
    {
        System.out.println("Name-Manish Nath, Makaut roll-14800119063.");
        if(args.length>0)
        {
            System.out.println("Reversed String:");
            for(String a:args)
            {
                StringBuffer s=new StringBuffer();
                s.append(a);
                s.reverse();
                System.out.print(s+" ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("No string found.");
        }
    }

}