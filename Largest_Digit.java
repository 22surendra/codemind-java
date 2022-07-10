import java.util.*;
class and{
    public static void main(String args[])
    {
        int n,r,max=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r>max)
        {
            max=r;
        }
        n=n/10;
        }
        System.out.println(max);
    }
}