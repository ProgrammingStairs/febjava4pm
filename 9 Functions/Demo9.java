// program showing the concept of function
import java.util.Scanner;

class Demo9{
    void operation(int a,int b){
        System.out.println("Sum : "+(a+b));
        System.out.println("Sub : "+(a-b));
        System.out.println("Mul : "+(a*b));
        System.out.println("Div : "+(a/b));
        System.out.println("Mod : "+(a%b));
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.operation(a,b);
    }
}

