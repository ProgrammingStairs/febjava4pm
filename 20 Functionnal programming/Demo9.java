// example showing the concept of method reference
// reference to a instance method of interface
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b); 
    default int addition(int a,int b){
        return a+b;
    }
}
class Demo9 implements Showable{
        public int calculate(int a,int b){ return 0;}
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj = new Demo9() :: addition;
        System.out.println("Sum : "+obj.calculate(a,b));    
    }
}