import java.io.*;

abstract class Figure
{
    double dim1;
    double dim2;
    Figure(double a, double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract double area();
}

class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        System.out.println("Inside area for rectangle.");
        return dim1*dim2;
    }
}

class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        System.out.println("Inside Area for Triangle.");
        return (dim1*dim2)/2;
    }
}

class Abstract_Areas
{
    public static void main(String args[])throws IOException
    {
        double a,b,c,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the rectangle:");
        a=Double.parseDouble(br.readLine());
        System.out.println("Enter the breadth of the rectangle:");
        b=Double.parseDouble(br.readLine());
        System.out.println("Enter the height of the circle:");
        c=Double.parseDouble(br.readLine());
        System.out.println("Enter the base of the circle:");
        d=Double.parseDouble(br.readLine());
        Rectangle r=new Rectangle(a , b);
        Triangle t=new Triangle(c , d);
        Figure figref;
        figref=r;
        System.out.println("Area is"+figref.area());
        figref=t;
        System.out.println("Area is"+figref.area());
    }
}