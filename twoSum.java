import java.util.*;
class twoSum {
    public int[] twoSum(int[] nums, int target)
    {
        int[] arr2=new int[2];
        int len=nums.length;
        for(int i=0; i<=len-1; i++)
        {
            for(int j=0; j<=len-1; j++)
            {
                int sum=nums[i]+nums[j];
            if(sum==target && i!=j)
            {
                arr2[0]=i;
                arr2[1]=j;
                return arr2;
            }
            }
        }
        return arr2;
    }
    public static void main(String[] args)
    {
        int tar,len1;
        String[] line;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        line=sc.next().split(",");
        len1=line.length;
        int[] arr=new int[len1];
        for(int j=0; j<len1-1;j++)
        {
            arr[j]=Integer.parseInt(line[j]);
        }
        System.out.println("Enter the target value:");
        tar=sc.nextInt();
        Solution array=new Solution();
        int[] arr2=array.twoSum(arr,tar);
        if(arr2[0]==0 && arr2[1]==0)
        {
            System.out.println("Result not found.");
        }
        else
        {

            System.out.println(Arrays.toString(arr2));
        }
        }
    }
