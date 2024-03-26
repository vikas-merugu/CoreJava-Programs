import java.io.*;
class Palindromeornot
{
  public static void main(String args[])
{
int a=212;
String result;
result=(a%10==a/100)?"palindrome":"not a palindrome";
System.out.println(result);
}
} 