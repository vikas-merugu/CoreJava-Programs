import java.util.*;
class Average
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

int i,n,count=0;
float sum=0,avg;
System.out.println("enter n");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("enter number");
num=sc.nextInt();
if(num==0)

break;
else
{
sum=sum+num;
count++
}
}
avg=sum/count;
System.out.println(avg);
}
}