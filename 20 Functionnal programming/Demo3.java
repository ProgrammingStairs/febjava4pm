// example showing the concept of lambda expression 
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b); 
}
class Demo3{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj = (int a1,int b1)->{
            return a1+b1;
        };
        System.out.println("sum : "+obj.calculate(a,b));
    }
}