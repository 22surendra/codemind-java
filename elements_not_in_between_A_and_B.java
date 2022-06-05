import java.util.Scanner;
class abd{
    public static void main(String args[]){
        int n,i,a,b;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int count=0;
        for(i=0;i<n;i++)
        {
          if(x[i]<a||x[i]>b)
          {
             System.out.print(x[i]+" ");
             count++;
          }
        }
        if(count==0)
        {
            System.out.print("-1");
        }
        
    }
    
}