// example showing the concept of Exception Handling

import java.util.Scanner;
class Demo4{
    void divide(int a,int b){
            int c = a/b;
            System.out.println("Result : "+c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo4 obj = new Demo4();
        try{
            obj.divide(a,b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}