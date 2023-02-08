import java.io.*;
import java.util.*;
class Pnr
{
public static void main(String args[])
{
System.out.println("Enter the value");
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int n=s.nextInt();
int r=s.nextInt();
int Ans=(p*n*r)/100;
System.out.println("The Simple intrest is"+ Ans);
}
}




