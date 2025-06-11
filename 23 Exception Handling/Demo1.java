// example showing the concept of Exception Handling

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Result : "+c);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
        finally{
            System.out.println("Executes definitely");
        }
        System.out.println("End of Program");
    }
}