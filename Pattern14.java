import java.util.*;
class Pattern14
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
char i,j;
//System.out.println("enter the value of n");
//n=sc.nextInt();
for(i='A';i<='E';i++)
{
for(j=i;j<'E';j++)
System.out.print(" ");
for(j='A';j<=i;j++)
System.out.print(j);
System.out.println("");
}
}
}


