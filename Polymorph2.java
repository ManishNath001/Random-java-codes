public class Polymorph2 
{

 
        void calc (double r) 
  	{
		double ar1 = 3.14 * r * r;
		System.out.println("Area of the circle= "+ar1);
	} 
 
	void calc (int len, int br) 
  	{
		int ar2 = len * br;
		System.out.println("Area of the rectangle= "+ar2);
	} 
 
	void calc (float a) 
  	{
		float ar3 = a * a;
		System.out.println("Area of the square= "+ar3);

	} 
 
	void calc (double h, double b) 
  	{
		double ar4 = (h * b) / 2.0;
		System.out.println("Area of the triangle= "+ar4);
	} 
 
 	

		public static void main (String args[]) 
  		{
			float f=4.0f;
			double m=10.0, n=5.0, p=9.0;
			int i=6, j=9;
			Polymorph2 obj1 = new Polymorph2();

			Polymorph2 obj2 = new Polymorph2();

			Polymorph2 obj3 = new Polymorph2();

			Polymorph2 obj4 = new Polymorph2();

 			obj1.calc (m);

			obj2.calc (i, j);

			obj3.calc (f);

			obj4.calc (n, p);

		} 
}	

