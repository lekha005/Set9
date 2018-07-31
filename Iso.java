import java.util.*;
class Iso
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         int c=0;
      for(int i=0;i<a.length();i++)
      {
          for(int j=0;j<a.length();j++)
          {
              if(i!=j && a.charAt(i)==a.charAt(j))
               c++;
          }
      }
          if(c==0)
            System.out.print("yes");
            else
            System.out.print("no");
    }    
        
}








