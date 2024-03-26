import java.util.*;
class Circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  float area,circumference,radius;
System.out.println("Enter the radius");
radius=sc.nextFloat();
area=3.142f*radius*radius;
circumference=2*3.142f*radius;
System.out.println("area of circle="+area);
System.out.println("circumference of a circle="+circumference);

}
}