
import java.util.Scanner;
import demo.NewClass;

public class Example extends NewClass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        GetSum obj = new GetSum();
        obj.getSum(a, b, c);        
        Example obj2 = new Example();
        obj2.display();
    }
}
