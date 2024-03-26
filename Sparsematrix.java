import java.util.*;
class Sparsematrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col,count=0;
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
for(j=0;j<col;j++)
{
if(a[i][j]==0)
count++;
}
}
if(count>(row*col)/2)
System.out.println("Sparse");
else
System.out.println("Not Sparse");


}
}

