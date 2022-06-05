import java.util.Scanner;
class abd{
    public static void main(String args[])
    {
        int i,n,sum=0;
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
        int count=0;
        for(i=0;i<n;i++)
        {
        if(avg==x[i])
        {
            count++;
            break;
        }
        }
        if(count==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
        
    }
}