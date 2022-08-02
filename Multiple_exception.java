public class Multiple_exception
{
  public static void main(String args[])
  {
    for(int i=0; i<3; i++)
    {
      int a;
      try
      {
        switch(i)
        {
          case 0: 
                  int arr1[] = null;
                  a = arr1[0];
                  break;
          case 1: 
                  int arr2[] = new int[5];
                  a = arr2[6];
                  break;
          case 2: 
                  char c = "Manish".charAt(15);
                  break; 
        }
      }
      catch(Exception e)
      {
        System.out.println("\n Test Case :"+i+"\n");
        System.out.println("\t"+e+"\n");
      }
    }
  }
}