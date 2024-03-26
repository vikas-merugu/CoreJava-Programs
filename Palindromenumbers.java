import java.util.*;
class Palindromenumbers
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

int i,n,rev=0,rem,temp;
System.out.println("enter the n");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
temp=i;
for(;temp>0;)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(i==rev)
System.out.print(i+" ");
rev=0;
}
}
}

