import java.util.*;
class Rowsort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,k,row,col,temp;
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

for(i=0;i<row;i++)
{

for(j=0;j<row;j++)
{
for(k=j+1;k<col;k++)
{
if(a[i][j]>a[i][k])
{
temp=a[i][j];
a[i][j]=a[i][k];
a[i][k]=temp;
}
}
}
}
for(i=0;i<row;i++)
{

for(j=0;j<row;j++)
{

System.out.print(a[i][j]+" ");
}
System.out.println("");
}
}
}

