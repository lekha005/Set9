import java.util.*;
class Gcd
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int b=in.nextInt();
         int c=0;
      for(int i=2;i<=(a*b);i++)
      {
          if(a%i==0 && b%i==0)
          {
          c=i;
          break;
          }
      }
      if(c==0)
      System.out.print("1");
      else
      System.out.print(c);
    }    
        
}








