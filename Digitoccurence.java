import java.util.*;
class Digitoccurence
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   
  int n,digit,rem,count=0;
System.out.println("enter the value of n");
n=sc.nextInt();

System.out.println("enter the digit");
digit=sc.nextInt();
while(n!=0)
{
rem=n%10;
if(rem==digit)
count++;
n=n/10;
}
System.out.println(digit+"has occured for" +count+ " times in the given number");
}
}

