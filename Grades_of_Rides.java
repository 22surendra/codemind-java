import java.util.Scanner;
class abd
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
         b=sc.nextInt();
          c=sc.nextInt();
        
        if(a>50&&b>60&&c>100)
        System.out.println("10");
        else if(a>50&&b>60&&c<100)
         System.out.println("9");
        else if(a<50&&b>60&&c>100)
         System.out.println("8");
          else if(a>50&&b<60&&c>100)
         System.out.println("7");
         else if(a>50||b>60||c>100)
         System.out.print("6");
         else
         System.out.println("5");
    }
}