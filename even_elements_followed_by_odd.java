import java.util.Scanner;
class abd{
    public static void main(String arbs[])
    {
        int n,i;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
         
         for(i=0;i<n;i++)
         {
             if(x[i]%2==0)
             {
                 System.out.print(x[i]+" ");
             }
         }
            for(i=0;i<n;i++)
         {
             if(x[i]%2==1)
             {
                 System.out.print(x[i]+" ");
             }
         }
    }
}