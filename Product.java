import java.util.*;
class Product
{
 public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
      
     int a,b,sum,diff,product;
      System.out.println("Enter the values of a and b");
        a=sc.nextInt();
            
       b=sc.nextInt();
sum=a+b;
diff=a-b;
product=sum*diff;
System.out.println("product of sum and difference="+product);
}
}