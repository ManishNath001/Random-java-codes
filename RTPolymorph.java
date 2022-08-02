class Info 
{
    public void show() 
    {
       System.out.println("Manish Nath");
    }
}
class Info2 extends Info 
{
    public void show() 
    {
        System.out.println("CSE 1, Group-A");
    }
}
public class RTPolymorph 
{
    public static void main(String args[]) 
    {
        Info obj1 = new Info();
        obj1.show(); 
        Info2 obj2 = new Info2(); 
        obj2.show();
        Info2 obj3 = new Info2();
        obj3.show(); 
    }
}
