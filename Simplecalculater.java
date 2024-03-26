import java.util.*;
class Simplecalculater
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,add,sub,mul,div,mod;
char choice;
System.out.println("*****SIMPLE CALCULATER******");
System.out.println("ADDITION");
System.out.println("SUBSTRACTION");
System.out.println("MULTIPLI");
System.out.println("DIVISION");
System.out.println("MODULUS");
System.out.println("enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter the choice");
choice=sc.next().charAt(0);
switch(choice)
{
case '+': add=a+b;
System.out.println("addition="+add);
break;
case '-': sub=a-b;
System.out.println("substraction="+sub);
break;
case '*': mul=a*b;
System.out.println("multiply="+mul);
break;
case '/': div=a/b;
System.out.println("quotient="+div);
break;
case '%': mod=a%b;
System.out.println("remainder="+mod);
break;
default: System.out.println("Invalid option");
}
}
}