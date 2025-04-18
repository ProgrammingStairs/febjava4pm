// program showing the concept of switch control statement
import java.util.Scanner;
class Demo24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("select option : ");
        System.out.println("R/r for area of Rectangle");
        System.out.println("C/c for area of Circle");
        System.out.println("E/e for Exit");

        System.out.println("Select code : ");
        char code = sc.next().charAt(0);

        switch(code){
            case 'r' :
            case 'R' : 
             System.out.println("Enter l and b : ");
             int l = sc.nextInt();
             int b = sc.nextInt();
             System.out.println("Area of rectangle : "+(l*b));
                        break;
            case 'C' : 
            case 'c' : 
             System.out.println("Enter radius : ");
             double r = sc.nextDouble();
             System.out.println("Area of Circle : "+(3.14*r*r));
                        break;

            case 'e' : 
            case 'E' : System.out.println("You Want to Exit\n Visit Again");
                        break;
                        
            default : System.out.println("Invalid selection");
                        break;
        }        
    }
}

