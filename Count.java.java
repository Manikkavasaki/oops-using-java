import java.io.*;
import java.util.*;
class Inclusive
{
public static void main(String args[])
{
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the integers");
	 int x=s.nextInt();
         int y=s.nextInt();
         int z=s.nextInt();
if((x!=0) && (y!=0) && (z!=0))
{
for(i=1;i<=y;i++)
{
count++;
}
int a=count/z;
System.out.print(a);
}
else
{
System.out.println("invalid");	 
  }
  }
}