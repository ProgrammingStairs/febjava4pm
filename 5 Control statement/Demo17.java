// program showing the concept of switch control statement
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel : ");
        char vowel = sc.next().charAt(0);
        switch(vowel){
            case 'A' : 
            case 'a' : System.out.println("Its a vowel");
                        break;
            case 'E' :
            case 'e' : System.out.println("Its a vowel");
                        break;
            case 'I' : 
            case 'i' : System.out.println("Its a vowel");
                        break;
            case 'O' : 
            case 'o' : System.out.println("Its a vowel");
                        break;
            case 'U' : 
            case 'u' : System.out.println("Its a vowel");
                        break;
            default : System.out.println("Not a vowel");
                        break;
        }
    }
}