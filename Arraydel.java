public class Arraydel {
    public static void main(String[] args) {
        int arr[]={1,5,4,3,8,9,23};
        int n=arr.length;
        int x=3;

        n=arraydel(arr,n,x);
        System.out.println("Modified array:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static int arraydel(int arr[], int n, int x)
    {
        int i;
        for(i=0; i<n; i++)
            if(arr[i]==x)
                break;
        
        if (i<n)
        {
            n=n-1;
            for(int j=i;j<n; j++)
                arr[j]=arr[j+1];
        }
        return n;
    }
    
}
