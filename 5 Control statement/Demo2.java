// program showing the concept of if statement
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Sum : "+a+b);
        System.out.println("Sum : "+(a+b));
        System.out.println(""+a+b+" : Sum");
        System.out.println(a+b+" : Sum");
        System.out.println((a+b)+" : Sum");
    
        if(a>b)
            System.out.println(a+" is greater");
        if(a<b)
            System.out.println(b+" is greater");
        if(a==b)
            System.out.println("Both are equal");
    }
}