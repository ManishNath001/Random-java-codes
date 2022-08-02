import java.io.*;

class CurrentThread
{
    public static void main(String args[])throws IOException
    {
        int a;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the last value:");
        a=Integer.parseInt(br.readLine());
        Thread t= Thread.currentThread();
        System.out.println("Current Thread:"+t);
        t.setName("My Thread");
        System.out.println("After name change:"+t);
        try
        {
            for(int n=1; n<=a ; n++)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("Thread is Interrupted.");
        }
    }

}
