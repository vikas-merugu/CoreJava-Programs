import java.util.*;
class Sumofodd 
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
int i,limit,sum=0;
System.out.println("enter the limit");
limit=sc.nextInt();

i=1;
do
{
sum=sum+i;
i=i+2;
}while(i<=limit);
System.out.println("sum of first 50 odd numbers is="+sum);
}
}
