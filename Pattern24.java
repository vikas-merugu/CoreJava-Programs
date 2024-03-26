import java.util.*;
class Pattern24
{
public static void main(String args[]) 
{
int i,j;
for(i=1;i<20;i++)
{
if(i<=10)
{
for(j=i;j<=10;j++)

System.out.print("$");
System.out.println("");

}
else
{
for(j=i;j>=10;j--)


System.out.print("$");
System.out.println("");

}
}
}
}


