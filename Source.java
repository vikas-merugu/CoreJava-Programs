import java.util.*;
class Source
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[5][5];
int i,j,source,replace,row,col;
System.out.println("enter size");
row=sc.nextInt();
col=sc.nextInt();
System.out.println("enter elements");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();

}
}
System.out.println("enter source");
source=sc.nextInt();
System.out.println("enter replace");
replace=sc.nextInt();
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(a[i][j]==source)
a[i][j]=replace;
}
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

