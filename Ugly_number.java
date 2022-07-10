import java.util.Scanner;
class abd
{
    public void pre(int n)
    {
        while(n%2==0)
        {
            n=n/2;
        }
        while(n%3==0)
        {
            n=n/3;
        }
        while(n%5==0)
        {
            n=n/5;
        }
        if(n==1)
        System.out.print("Ugly Number");
        else
        System.out.print("Not Ugly Number");
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        abd a=new abd();
        a.pre(n);
    }
}