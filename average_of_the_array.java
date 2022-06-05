import java.util.Scanner;
class abd{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
       double avg=(double)sum/n;
        System.out.format("%.2f",avg);
        
    }
}