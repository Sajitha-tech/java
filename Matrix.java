import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];

int n=3;
int m=3;
int flag=0;
System.out.println(" Enter the elements of Matrix A:");
for(int i=0;i<n;i++)
for(int j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}

System.out.println(" Matrix A:");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(a[i][j]+"  ");
}
System.out.println();  
}

for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(a[i][j]==a[j][i])
{
 flag=1;
}
}
}


if(flag==1)
{
System.out.println("Matrix A is Symmetric");
}
else
{
System.out.println("Matrix A is not Symmetric");
}
}
}

