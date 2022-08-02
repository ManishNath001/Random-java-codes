interface Marks
{
    int mark=96;
    void getmarks();
}

interface Sports
{
    int run=121;
    void getrun();
}

class Student implements Marks,Sports
{
    String name="Manish Nath";
    int age=20, percentage,wickets=6;
    public void getmarks()
    {
        percentage=(mark*100)/100;
        System.out.println("Method getmarks");
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of the Student:"+age);
        System.out.println("Total Marks of the Student:"+mark);
        System.out.println("Percentage of the Student:"+percentage);
    }
    public void getrun()
    {
        System.out.println("Method getrun");
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of the Student:"+age);
        System.out.println("Total Marks of the Student:"+run);
        System.out.println("Percentage of the Student:"+wickets);
    }
}

class Marks_Sports
{
    public static void main(String args[])
    {
        Student obj1=new Student();
        obj1.getmarks();
        obj1.getrun();
    }
}