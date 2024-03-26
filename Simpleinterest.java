import java.util.*;
class Simpleinterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

 int principle_amount,time_period;
 float rate_of_interest,simple_interest;
  
System.out.println("Enter the principle amount");
principle_amount=sc.nextInt();
System.out.println("Enter the time period");
time_period=sc.nextInt();
System.out.println("Enter the rate of interest");
rate_of_interest=sc.nextFloat();
simple_interest=(principle_amount*time_period*rate_of_interest/100);
System.out.println("simple interest="+simple_interest);
}
}


