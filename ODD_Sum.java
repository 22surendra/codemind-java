import java.util.Scanner;
class Abd{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
             if(x[i]%2!=0)
             sum=sum+x[i];
        }
        System.out.print(sum);
    }
}