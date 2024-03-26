import java.util.*;
class Electricitybill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int current,previous,tunits;
float e_bill;
System.out.println("enter the reading current & previous meter reading");
current=sc.nextInt();
previous=sc.nextInt();
tunits=current-previous;
System.out.println("total number of units consumed="+units);

if(tunits<=100)
  e_bill=tunits*0.80f;
else if(tunits>100)