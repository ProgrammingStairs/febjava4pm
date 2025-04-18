// program showing the concept of recursion
/*
Recursion : Recursion is the process, in which a function calls itself in a repetative manner untill certain condition is satisfied.
*/
import java.util.Scanner;
class Demo17{
    int fact(int n){
        if(n==0)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
       int num = sc.nextInt();

       Demo17 obj = new Demo17();
       System.out.println("Factorial : "+obj.fact(num)); 
    }
}





















