import java.util.*;
class Pattern2
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

int i,j,n;
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=n;i>=1;i--)
{
for(j=5;j>=1;j--)
System.out.print(j);
System.out.println("");
}
}
}