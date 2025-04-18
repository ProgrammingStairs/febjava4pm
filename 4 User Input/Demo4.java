// program to swap two numbers without using third variable
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter First Number : ");
        int a = sc.nextInt(); 
        
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            // a = a+b;
            // b = a-b;
            // a = a-b;

            // a = a*b;
            // b = a/b;
            // a = a/b;

            a = a^b;
            b = a^b;
            a = a^b;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);

    }
}























