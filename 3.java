import java.io.*;
import java.util.Scanner;
class Grandparent{
    public
    String gname;
    public void displayGname(){
        System.out.println("enter the Grandparent name:");
        Scanner sc=new Scanner(System.in);
        gname=sc.nextLine();
    }
}

class parent extends Grandparent{
    public 
    String address,occupation,pname;
    public void displayPname(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the address:");
        address=sc.nextLine();
        System.out.println("enter the occupation:");
        occupation=sc.nextLine();
        System.out.println("enter the parent name:");
        pname=sc.next();
    }
}

class child extends parent{
    public
    String name;
    int aadhar,age;
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the aadhar number");
        aadhar=sc.nextInt();
        displayGname();
        displayPname();
        System.out.println("enetr the child name");
        name=sc.nextLine();
        System.out.println("enter the age");
        age=sc.nextInt();
        }
    public void details(){
        System.out.println("Grandparent:"+gname);
        System.out.println("Address:"+address);
        System.out.println("Aadhar number:"+aadhar);
        System.out.println("Parent name:"+pname);
        System.out.println("Parent Occupation"+occupation);
        System.out.println("Child name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String args[]){
        child a=new child();
        a.getdetails();
        a.details();
    }
}
