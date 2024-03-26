class ClineInput
{
public static void main(String args[])
{
int invalid=0;
int number,valid=0;
for(int i=0;i<args.length;i++)
{
try
{
Number=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
System.out.println(e.getMessage());
invalid=invalid+1;
System.out.println("Invalid Numbers:"+args[i]);
continue;
}
valid=valid+1;
}
System.out.println("valid Number is:"+valid);
System.out.println("Invalid Number is:"+invalid);
}
}