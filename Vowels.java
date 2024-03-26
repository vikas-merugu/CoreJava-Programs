import java.util.*;
class Vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
switch(ch)
{
   
case 'A':
case 'E':
case 'I':

case 'O':
case 'U':
case 'a':
case 'e':
case 'i':
case 'o':
case 'u': System.out.println("vowel");
 break;
default : System.out.println("not a vowel");
}
}
}