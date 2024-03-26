import java.io.*;
class Largestofthree
{
public static void main(String args[])
{
     float a=24.45f,b=10.34f,c=5.12f,largest;
     largest=((a>b)&&(a>c))?a:(b>c)?b:c;
     System.out.println("largest of three numbers="+largest);
}
}