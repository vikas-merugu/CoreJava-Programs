import java.io.*;
class Sumofthreedigits
{
public static void main(String args[])
{
int n=456,n1,n2,n3,sum;
n1=n%10;
n2=n/10;
n3=n/100;
sum=n1+n2+n3;
System.out.println(sum);
}
}