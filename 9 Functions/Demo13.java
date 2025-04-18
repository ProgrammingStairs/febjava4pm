// program showing the concept of function
import java.util.Scanner;
class Demo13{
    int a,b;// instance variable | object variable | multiple copies
    void setData(int a,int b){
        this.a = a;
        this.b = b;
        add();   // this.add();
        this.sub();
        mul(); // this.mul();
        this.div();
        mod(); // this.mod();
    }
    void add(){
        System.out.println("Sum : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }
    void div(){
        System.out.println("Div : "+(a/b));
    }
    void mod(){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Demo13 obj = new Demo13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.setData(a,b);
    }
}

