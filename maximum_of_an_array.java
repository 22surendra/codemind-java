import java.util.Scanner;
class abd
{
    public static void main(String []args)
    {
        int n,i,max;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int [n];
        for( i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        max=x[0];
         for(i=0;i<n;i++)
         {
             if(x[i]>max)
             {
                 max=x[i];
             }
         }
         System.out.println(max);
    }
}