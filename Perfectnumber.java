import java.util.*;
class Perfectnumber
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

int sum=0,i,n;
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
sum=sum+i;
}
if(n==sum)
System.out.println("perfect number");
else

System.out.println("not a perfect number");
}
}