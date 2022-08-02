class Shape 
{

String name;

double ar;

 
void calc (double r, String n) 
  {

name = n;

ar = 3.14 * r * r;

disArea ();

} 
 
void calc (int len, int br, String n) 
  {

name = n;

ar = len * br;

disArea ();

} 
 
void calc (float a, String n) 
  {

name = n;

ar = a * a;

disArea ();

} 
 
void calc (double h, double b, String n) 
  {

name = n;

ar = (h * b) / 2.0;

disArea ();

} 
 
void disArea () 
  {

System.out.println ("\nArea of " + name + " = " + ar);

} 
} 
 
 
public class Poly 

{

public static void main (String args[]) 
  {

Shape obj1 = new Shape ();

Shape obj2 = new Shape ();

Shape obj3 = new Shape ();

Shape obj4 = new Shape ();

 
obj1.calc (10.0, "Circle");

obj2.calc (6, 9, "Rectangle");

obj2.calc (4.0f, "Square");

obj4.calc (5.0, 9.0, "Triangle");

} 
}