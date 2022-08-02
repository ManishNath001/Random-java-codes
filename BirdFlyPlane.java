interface Flying
{
    String m="can fly";
    void canFly();
}

interface A
{
    void speed_ob(); 
}

class Birds implements Flying,A
{
    int speed;
    public void canFly()
    {
        System.out.println("Class Birds");
        System.out.println("Birds"+m);
    }
    public void calculate(int dis, int time)
    {
        speed=dis/time;
    }
    public void speed_ob()
    {
        System.out.println("Speed of bird:"+speed);
    }
}

class Plane implements Flying,A
{
    int speed;
    public void canFly()
    {
        System.out.println("Class Plane");
        System.out.println("Plane"+m);
    }
    public void calculate2(int dis, int time)
    {
        speed=dis/time;
    }
    public void speed_ob()
    {
        System.out.println("Speed of Plane:"+speed);
    }
}

class BirdFlyPlane
{
    public static void main(String args[])
    {
        Birds obj1=new Birds();
        Plane obj2=new Plane();
        obj1.canFly();
        obj1.calculate(80,2);
        obj1.speed_ob();
        obj2.canFly();
        obj2.calculate2(75,3);
        obj2.speed_ob();
    }
}