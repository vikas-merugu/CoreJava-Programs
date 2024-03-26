import java.util.*;
class Nearestvalue
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
r=n%5;
if(r==0)
System.out.println(n+"is divisible by 5");
else
{
if(r>2)
System.out.println("nearest number="+(n-r+5));
else
System.out.println("nearest number="+(n-r));

}
}
