import java.io.*;
import java.util.*;
class Odev
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}