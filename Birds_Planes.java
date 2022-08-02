interface Flying
{
    String m="can fly";
    void canFly();
}

class Birds implements Flying
{
    public void canFly()
    {
        System.out.println("Class Birds");
        System.out.println("Birds"+m);
    }
}

class Plane implements Flying
{
    public void canFly()
    {
        System.out.println("Class Plane");
        System.out.println("Plane"+m);
    }
}

class Birds_Planes
{
    public static void main(String args[])
    {
        Birds obj1=new Birds();
        Plane obj2=new Plane();
        obj1.canFly();
        obj2.canFly(); 
    }
}