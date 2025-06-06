// example showing the concept of lambda expression 
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b); 
}
class Demo4{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj;
        obj = (a1,b1)->(a1+b1);
        System.out.println("sum : "+obj.calculate(a,b));
    
        obj = (a1,b1)->(a1-b1);
        System.out.println("sub : "+obj.calculate(a,b));
    
        obj = (a1,b1)->(a1*b1);
        System.out.println("mul : "+obj.calculate(a,b));
    
        obj = (a1,b1)->(a1/b1);
        System.out.println("div : "+obj.calculate(a,b));
    
    }
}