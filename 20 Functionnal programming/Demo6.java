// example showing the concept of method reference
// reference to a static method
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b); 
}
class Demo6{
    static int addition(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj = Demo6 :: addition;
        System.out.println("div : "+obj.calculate(a,b));    
    }
}