// program showing the concept of switch control statement
import java.util.Scanner;
class Demo25{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select color : ");
        String color = sc.next().toLowerCase();
        switch(color){
            case "red" : 
             System.out.println("Its Red color");
                        break;
            case "green" : 
             System.out.println("Its green color");
                        break;
            case "yellow" : System.out.println("Its yellow color");
                        break;
            default : System.out.println("Invalid selection");
                        break;
        }        
    }
}

