import java.util.*;
class Abd{
   public static void main(String args[])
   {
       int n,key,i,count=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int x[]=new int[n];
       for(i=0;i<n;i++)
       {
           x[i]=sc.nextInt();
       }
        key=sc.nextInt();
        for(i=0;i<n;i++)
       {
          if(x[i]==key)
          count++;
       }
       System.out.println(count);
   }
}