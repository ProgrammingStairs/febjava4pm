// program showing the concept of switch control statement
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel : ");
        String vowel = sc.next().toLowerCase();
        switch(vowel){
            case "a" : System.out.println("Its a vowel");
                        break;
            case "e" : System.out.println("Its a vowel");
                        break;
            case "i" : System.out.println("Its a vowel");
                        break;
            case "o" : System.out.println("Its a vowel");
                        break;
            case "u" : System.out.println("Its a vowel");
                        break;
            default : System.out.println("Not a vowel");
                        break;
        }
    }
}