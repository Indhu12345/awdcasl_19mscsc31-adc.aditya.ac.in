import java.util.*;
class BiggestNumber
{
 public static void main(String args[])
 {
  int a,b,c,d;
  System.out.println("enter 4 numbers");
  Scanner scn=new Scanner(System.in);
  a=scn.nextInt();
  b=scn.nextInt();
  c=scn.nextInt();
  d=scn.nextInt();
  if(a>b)
  {
   if(a>c)
   {
    if(a>d)
    {
    System.out.println(+a +"is the biggest number");
    }
    else
    System.out.println(+d +"is the biggest number");
   }
   else
   {
   if(c>d)
   System.out.println(+c +"is the biggest number");
   else
   System.out.println(+d +"is the biggest number");
   }
  }
  else
  {
  if(b>c)
  {
  if(b>d)
  System.out.println(+b +"is the biggest number");
  }
  else
  {
  if(c>d)
  System.out.println(+c +"is the biggest number");
  else
  System.out.println(+d +"is the biggest number");
  }
  }
 } 
}