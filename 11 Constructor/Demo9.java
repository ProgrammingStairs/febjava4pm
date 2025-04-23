// program showing the concept of parameterized constructor | copy constructor functionality

import java.util.Scanner;
class Demo9{
    // instance variables (multiple copies --> wrt object)
    int rno;
    double per;
    String name;

    // Parameterized constructor
    Demo9(Demo9 obj){
       this.name = obj.name; 
       this.rno = obj.rno;
       this.per = obj.per;
    }
    
    // parameterized constructor
    Demo9(String name,int rno,double per){
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
        Demo9 obj = new Demo9(name,rno,per); // parameterized constructor
        Demo9 obj1 = new Demo9(obj);
        obj.display();
        System.out.println("\nAfter copying : ");
        obj1.display();
    }
}