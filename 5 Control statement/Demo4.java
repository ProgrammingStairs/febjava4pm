// program showing the concept of if else statement
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if(a%b==0)
            System.out.println(a+" is divisible by "+b);
        else
            System.out.println(a+" is not divisible by "+b);
    }
}