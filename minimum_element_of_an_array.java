import java.util.Scanner;
class aabd
{
    public static void main(String args[])
    {
        int n,i,min=999;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
    {
        if(x[i]<min)
        {
            min=x[i];
        }
    }
    System.out.println(min);
    }
}