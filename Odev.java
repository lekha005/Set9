import java.util.*;
class Odev
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         String o="";
         String e="";
      for(int i=0;i<a.length();i++)
      {
          if((i+1)%2==0)
            e=e+String.valueOf(a.charAt(i));
            else
            o=o+String.valueOf(a.charAt(i));
      }
            System.out.print(o+" "+e);
    }    
        
}








