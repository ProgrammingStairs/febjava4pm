// program showing the concept of function
// no argument with return type
import java.util.Scanner;

class Demo6{
    int addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        System.out.println("Sum : "+obj.addition()); // function calling
    }
}

