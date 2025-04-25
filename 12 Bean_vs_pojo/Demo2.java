// example showing the concept of Bean class

import java.util.Scanner;
import java.io.*;
class Student implements Serializable{
    private int rno;
    private double per;
    private String name;

    Student(){}

    // setter methods
    public void setRollNo(int rno){
        this.rno=rno;
    }
    public void setPer(double per){
        this.per=per;
    }
    public void setName(String name){
        this.name=name;
    }

    // getter methods
    public int getRollNo(){
        return rno;
    }
    public double getPer(){
        return per;
    }
    public String getName(){
        return name;
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rno = sc.nextInt();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        Student obj = new Student();
        obj.setRollNo(rno);
        obj.setPer(per);
        obj.setName(name);

        System.out.println("Roll Number : "+obj.getRollNo());
        System.out.println("Percentage : "+obj.getPer());
        System.out.println("Name : "+obj.getName());
    }
}