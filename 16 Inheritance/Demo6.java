// example showing the concept of Hierarchical Inheritance
import java.util.Scanner;
class Person{
    int age;
    String name;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
    }
    void showData(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String course;
    void getStudData(){
        getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Fees : ");
        fees = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course Name : ");
        course = sc.nextLine();
    }
    void showStudData(){
        showData();
        System.out.println("Course Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String designation;
    void getEmpData(){
        getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Salary : ");
        salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Designation : ");
        designation = sc.nextLine();
    }
    void showEmpData(){
        showData();
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}
class Demo6{
    public static void main(String args[]){
        Student sobj = new Student();
        Employee eobj = new Employee();
            sobj.getStudData();
            eobj.getEmpData();

            sobj.showStudData();
            eobj.showEmpData();
    }
}