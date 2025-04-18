// program showing the concept of function
import java.util.Scanner;

class Demo10{
    void add(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Sub : "+(a-b));
    }
    void mul(int a,int b){
        System.out.println("Mul : "+(a*b));
    }
    void div(int a,int b){
        System.out.println("Div : "+(a/b));
    }
    void mod(int a,int b){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Demo10 obj = new Demo10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
        obj.mod(a,b);
    }
}

