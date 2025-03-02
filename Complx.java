import java.util.Scanner;

public class Complx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The 1st real part :");
int r1=sc.nextInt();
System.out.println("Enter The 1st img part :");
int i1=sc.nextInt();

System.out.println("The entered Complex no1 is:" + r1+ "+" +i1+"i");

System.out.println("Enter The 2nd real part :");
int r2=sc.nextInt();
System.out.println("Enter The 1st real part :");
int i2=sc.nextInt();

System.out.println("The entered Complex no is2:" + r2+ "+" +i2+"i");

int r3=r1+r2;
int i3=i1 +i2;
System.out.println();
System.out.println("The Sum of  Complex numbers :" + r3+ "+" +i3+"i");
}
}


