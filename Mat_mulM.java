import java.io.*;
public class Mat_mulM
{
    public static void main(String args[])throws IOException
    {
        int r1,c1,r2,c2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the First matrix.");//taking input of the size of the matrices
        System.out.println("Enter the number of rows:");
        r1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns:");
        c1=Integer.parseInt(br.readLine());
        System.out.println("Enter the size of the Second matrix.");
        System.out.println("Enter the number of rows:");
        r2=Integer.parseInt(br.readLine());

        if(c1!=r2)
        {
            System.out.println("Error!Column of first matrix should be equal to the Rows of the second matrix.");
        }

        else
        {
            System.out.println("Enter the number of columns:");
            c2=Integer.parseInt(br.readLine());
            int arr1[][]=new int[r1][c1];//declaring the 2d arrays to store the value of the matrices
            int arr2[][]=new int[r2][c2];
            int arr3[][]=new int[r1][c2];

            for( int i=0 ; i<r1 ; i++)//taking user input of the values of the first matrix
            {
                for( int j=0 ; j<c1 ; j++)
                {
                    System.out.println("Enter the value at ["+i+"] ["+j+"]:");
                    arr1[i][j]=Integer.parseInt(br.readLine());//initializing first matrix
                }
            }
            for( int m=0 ; m<r2 ; m++)//taking user input of the values of the Second matrix
            {
                for( int n=0 ; n<c2 ; n++)
                {
                    System.out.println("Enter the value at ["+m+"] ["+n+"]:");
                    arr2[m][n]=Integer.parseInt(br.readLine());//initializing Second matrix
                }
            }
            for( int l=0 ; l<r1 ; l++)
            {
                for( int o=0 ; o<c1 ; o++)
                {
                    for( int p=0 ; p<c2 ; p++)
                    {
                        arr3[l][p]+=arr1[l][o]*arr2[o][p];//multiplying mat1 and mat2
                    }
                }
            }
            System.out.println("Resultant Matrix:");
            for( int u=0 ; u<r1 ; u++)
            {
                for( int v=0 ; v<c2 ; v++)
                {
                    System.out.print(arr3[u][v]+" ");//printing the new matrix
                }
                System.out.println();
            }
        }
    }
}