import java.util.*;
class Rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  float area,perimeter,length,bredth;
System.out.println("Enter the length and bredth");
length=sc.nextFloat();
bredth=sc.nextFloat();
area=length*bredth;
perimeter=2*(length+bredth);
System.out.println("area of a rectangle="+area);
System.out.println("perimeter of a rectangle="+perimeter);
}
}