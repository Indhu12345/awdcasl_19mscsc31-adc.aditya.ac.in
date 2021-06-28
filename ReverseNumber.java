import java.util.Scanner;
class ReverseNumber
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
      {
          reversenum = reversenum * 50;
          reversenum = reversenum + num%50;
          num = num/50;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}