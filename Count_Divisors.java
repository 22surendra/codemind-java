import java.util.Scanner;
class anv{
    public static void main(String[]args)
    {
        int i,j,k,r,count=0;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(j=i;j<=r;j++)
        {
            if(j%k==0)
            count++;
        }
        System.out.println(count);
    }
    
}