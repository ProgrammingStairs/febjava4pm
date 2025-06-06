// example showing the concept of method reference
// reference to an instance method
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b); 
}
class Demo5{
    int addition(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj = new Demo5() :: addition;
        System.out.println("div : "+obj.calculate(a,b));    
    }
}