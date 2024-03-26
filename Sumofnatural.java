import java.util.*;
class Sumofnatural
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   
  int i,sum=0,n;

 System.out.println("enter the value of n");
 n=sc.nextInt();
i=1;

while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(sum);
  


}
}