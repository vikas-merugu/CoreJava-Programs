import java.util.*;
class Rowexchange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col,n1,n2,temp;
System.out.println("enter the size of Array");
row=sc.nextInt();
col=sc.nextInt();
System.out.println("enter the elements of Array");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("no of rows to be exchanged");
n1=sc.nextInt();
n2=sc.nextInt();
for(i=0;i<row;i++)
{
temp=a[n2-1][i];
a[n2-1][i]=a[n1-1][i];
a[n1-1][i]=temp;
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{

System.out.print(a[i][j]+" ");

}
System.out.println("");
}
}
}

