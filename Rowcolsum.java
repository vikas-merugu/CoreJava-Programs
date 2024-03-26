import java.util.*;
class Rowcolsum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col,rsum,csum;
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
rsum=0;
for(j=0;j<col;j++)
{
rsum=rsum+a[i][j];
}
System.out.println(rsum);
}
for(i=0;i<row;i++)
{
csum=0;
for(j=0;j<col;j++)
{
csum=csum+a[j][i];
}
System.out.println(csum);

}
}
}

