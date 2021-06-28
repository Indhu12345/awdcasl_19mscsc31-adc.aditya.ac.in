import java.util.Scanner;
class EvenNumbers
 {
private static Scanner sc;
public static void main(String[] args) 
{
int n,m;
sc = new Scanner(System.in);
System.out.print(" Enter the n value : ");
n = sc.nextInt();			
System.out.print(" Enter the m value : ");
m = sc.nextInt();	
ReverseEvenNumbers(n, m);
}
public static void ReverseEvenNumbers(int n, int m)
{
int i;
for(i = n; i >= m; i--)
{
if(i%2==0)
System.out.print(i +" "); 
}	
}
}