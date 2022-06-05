import java.util.Scanner;
class abd{
    public static void main(String args[])
    {
        int n,i,sum=0,count=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(x[i]<=avg)
            count++;
        }
        System.out.println(count);
    }
}