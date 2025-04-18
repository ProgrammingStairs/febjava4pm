// program showing the concept of switch control statement
import java.util.Scanner;
class Demo22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("select option : ");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        System.out.println("Select code : ");
        int code = sc.nextInt();

        switch(code){
            case 1 : System.out.println("Addition : "+(a+b));
                        break;
            case 2 : System.out.println("Subtraction : "+(a-b));
                        break;
            case 3 : System.out.println("Multiplication : "+(a*b));
                        break;
            case 4 : System.out.println("Division : "+(a/b));
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }        
    }
}

