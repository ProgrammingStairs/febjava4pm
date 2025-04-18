// program showing the concept of switch control statement
import java.util.Scanner;
class Demo23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("select option : ");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");

        System.out.println("Select code : ");
        char code = sc.next().charAt(0);

        switch(code){
            case '+' : System.out.println("Addition : "+(a+b));
                        break;
            case '-' : System.out.println("Subtraction : "+(a-b));
                        break;
            case '*' : System.out.println("Multiplication : "+(a*b));
                        break;
            case '/' : System.out.println("Division : "+(a/b));
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }        
    }
}

