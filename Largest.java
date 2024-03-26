import java.util.*;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col,largest,r=0,c=0;
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
largest=a[0][0];

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(a[i][j]>largest)

largest=a[i][j];
}

}
}
System.out.println("largest="+largest);
System.out.println(r);
System.out.println(c);

}
}


