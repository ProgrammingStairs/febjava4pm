// program to swap two numbers using third variable
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter First Number : ");
        int a = sc.nextInt(); 
        
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            int temp=a;
            a=b;
            b=temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);

    }
}























