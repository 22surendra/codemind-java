import java.util.Scanner;
class avd{
    public static void main(String srfd[]){
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         for(i=0;i<n-1;i++)
         {
             if(arr[i]>arr[i+1])
         count=count+1;}
         if(count==n-1)
         {
         System.out.println("yes");
         }
         else{
             System.out.println("no");
         }
         
    }
}