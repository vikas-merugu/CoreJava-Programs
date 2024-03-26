import java.util.*;
import java.lang.*;
class Swapoffirstandlast
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   
int n,temp,firstdigit=0,lastdigit=0,count=0,result,digits;
System.out.println("enter the value of n");
n=sc.nextInt();
lastdigit=n%10;
temp=n;
while(temp>0)
{
firstdigit=temp%10;
temp=temp/10;
count++;

}
digits=count-1;
result=lastdigit;
result=result*(int)Math.pow(10,digits);
result=result+n%(int)Math.pow(10,digits);

result=result-lastdigit;
result=result+lastdigit;
System.out.println(result);
}
}

