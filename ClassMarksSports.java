interface Student
{
    String name="Manish Nath";
    int age=20;
    void getDetails();
}

class Marks implements Student
{
    int totalmarks, percentage;
    public void getDetails()
    {
        System.out.println("Class Marks");
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of the Student:"+age);
    }
    public void edu(int maths, int physics, int chem, int totalmarks)
    {
        totalmarks= maths+physics+chem;
        percentage= (totalmarks*100)/totalmarks;
        System.out.println("Total Marks of the Student:"+totalmarks);
        System.out.println("Percentage of the Student:"+percentage);
    }
}

class Sports implements Student
{
    int totalruns;
    public void getDetails()
    {
        System.out.println("Class Sports");
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of the Student:"+age);
    }
    public void game(int fmatch, int smatch, int tmatch, char totalwickets)
    {
        totalruns= fmatch+smatch+tmatch;
        System.out.println("Class Sports");
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of the Student:"+age);
        System.out.println("Total Runs of the Student:"+totalruns);
        System.out.println("Total Wickets taken by the Student:"+totalwickets);
    }
}

class ClassMarksSports
{
    public static void main(String args[])
    {
        Marks obj1=new Marks();
        obj1.getDetails();
        obj1.edu(95,92,88,300);
        Sports obj2=new Sports();
        obj2.getDetails();
        obj2.game(88,45,101,'6');
    }
}