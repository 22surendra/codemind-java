import java.util.Scanner;
class abd{
    public static void main (String args[])
    {
        int n,i,k,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         k=sc.nextInt();
         for(i=0;i<n;i++)
         {
             if(arr[i]==k)
             {
                 count=count+1;
             }
         }
         System.out.println(count);
    }
}