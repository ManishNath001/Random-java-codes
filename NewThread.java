import java.lang.*;
import java.io.*;


class NewThread implements Runnable
{
    public void run()
    {
        for(int i=0; i<6; i++)
        {
            try
            {
                Thread.sleep(1100);
            }
            catch (Exception e)
            {
                System.out.println("Exception Caught");
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();

        Thread th1 = new Thread(t1);
        th1.start();

        Thread th2 = new Thread(t2);
        th2.start();
    }
}