// example showing the concept of static keyword
/*
    Student ---> data member : rno, name (instance variable | object variable)
                               collegeName (static variable | class variable)                         
        
        s1 ------ rno , name ---|
                                |-- collegeName 
        s2 ------ rno , name ---|
*/
import java.util.Scanner;
class Student{
    int rno;
    String name;
    static String collegeName;
    static void getCollegeName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        collegeName = sc.nextLine();
    }
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println("\n\nDetails : \nRoll Number : "+rno+"\nName : "+name+"\nCollege Name : "+collegeName);
    }
}
class Demo11{
    public static void main(String args[]){
        Student.getCollegeName();
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");
        s1.display();
        s2.display();
    }
}