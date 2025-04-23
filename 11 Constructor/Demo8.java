// program showing the concept of parameterized constructor

import java.util.Scanner;
class Demo8{
    // instance variables (multiple copies --> wrt object)
    int rno;
    double per;
    String name;

    // Default constructor
    Demo8(){
        System.out.println("Default constructor called");
    }
    
    // parameterized constructor
    Demo8(String name,int rno,double per){
        this.rno = rno;
        this.per = per;
        this.name = name;
    }
    
    // instance method
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number : ");
        int rno = sc.nextInt();
        
        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();
        Demo8 obj1 = new Demo8();
        Demo8 obj = new Demo8(name,rno,per); // parameterized constructor
        obj.display();
    }
}