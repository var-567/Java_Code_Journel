import java.io.*;
import java.util.Scanner;
class Student{
    public
    int regno;
    int year;
String name;
public void method(){
Scanner ob = new Scanner(System.in);
System.out.print("Enter student name:");
name=ob.nextLine();
System.out.print("Enter register number:");
regno=ob.nextInt();
System.out.print("Enter year:");
year=ob.nextInt();
}
}

class Marks extends Student{
int arr[]=new int[5],tot;
public void method2()
{
Scanner ob = new Scanner(System.in);
System.out.print("Enter Student marks : ");
for (int i=0;i<5;i++)
{
arr[i]=ob.nextInt();
tot = tot + arr[i];
}
}
public void display()
{
System.out.println("\t\t\t *****STUDENT DETAILS*****");
System.out.println("Name :"+name);
System.out.println("Register number:"+regno);
System.out.println("Year:"+year);
System.out.println("Total Marks Obtained :"+tot);
}
public static void main(String[] arg)
{
Marks s=new Marks();
s.method();
s.method2();
s.display();
}
}