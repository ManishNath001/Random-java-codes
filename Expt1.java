class New_Expt extends Exception
{
    private int exp;
    New_Expt(int a)
    {
        exp=a;
    }
    public String toString()
    {
        return "Exception occured:Number is greater than 10.";
    }
}

class Expt1
{
    static void compute(int a)throws New_Expt
    {
        System.out.println("compute called, value="+a);
        if(a>10)
            throw new New_Expt(a);
        System.out.println("number smaller than 10.");
    }
    public static void main(String args[])
    {
        try
        {
            compute(5);
            compute(56);
        }
        catch(New_Expt e)
        {
            System.out.println(e);
        }
    }
}
