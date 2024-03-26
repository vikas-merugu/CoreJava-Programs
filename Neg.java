class Neg
{
public static void main(String args[])
{
try
{
int arr[]=new int[-3];
arr[1]=100;
arr[2]=200;
arr[3]=300;
System.out.println("First Element:"+arr[0]);
System.out.println("Second Element:"+arr[1]);
System.out.println("Third Element:"+arr[2]);
}
catch(NegativeArraySizeException n)
{

n.printStackTrace();
}
System.out.println("After try block no output");
}
}

