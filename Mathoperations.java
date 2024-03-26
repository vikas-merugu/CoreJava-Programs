import java.io.*;
import java.lang.*;
class Mathoperations
{
 public static void main(String args[])
{

int a=5,b=-10,c=4,d=10;int min=0,max=1000;

int y=45;

double z;

float p=3.142f;

System.out.println(Math.sqrt(a));

System.out.println(Math.abs(b));

System.out.println(Math.cbrt(c));

System.out.println(Math.max(a,b));

System.out.println(Math.min(a,b));

System.out.println(Math.exp(a));

System.out.println(Math.log(a));

System.out.println(Math.log10(d));


System.out.println((int)(Math.random()*(max-min+1)+min));
z=Math.toRadians(y);
}
}