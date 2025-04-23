// Example showing the concept of constructor
import java.util.Scanner;
class Demo6{
    int rno;
    double per;
    String name;
    Demo6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        rno = sc.nextInt();
        System.out.println("Enter Percentage : ");
        per = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.display();    
    }
}