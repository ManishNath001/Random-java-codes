class Example
{
    public void display()
    {
        System.out.println("Display function of parent class Example");
    }
}
class Example2 extends Example
{
    int num2=0;
    void func()
    {
        System.out.println("Overloaded function of child class Example2 called");
    }
    void func(int n,int m)
    {
        num2=m;
        System.out.println("Overloaded function of child class Example2 with parameter called and the parameter value="+num2);
    }
    public void display()
    {
        super.display();
        System.out.println("Display function of class Example2");
    }
    
}
class ExampleMain
{
    public static void main(String args[])
    {
        Example2 obj1=new Example2();
        Example2 obj2=new Example2();
        Example2 obj3=new Example2();
        obj1.func();
        obj2.func(100,456);
        obj3.display();


    }
}
