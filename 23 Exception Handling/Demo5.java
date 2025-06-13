// example showing the concept of Exception Handling

import java.util.Scanner;
class Demo5{
    void divide(int a,int b){
            int c = a/b;
                if(c>=5)
                    throw new ArithmeticException("Result Greater than or equals to 5");
            System.out.println("Result : "+c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo5 obj = new Demo5();
        try{
            obj.divide(a,b);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Exception : "+e.getMessage());
        }
    }
}