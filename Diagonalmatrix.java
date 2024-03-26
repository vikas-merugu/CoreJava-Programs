import java.util.*;
class Diagonalmatrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col;
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
if((i<j||j>i)&&(a[i][j]==0))

System.out.println("Diagonal Matrix");

}
}
}
}
