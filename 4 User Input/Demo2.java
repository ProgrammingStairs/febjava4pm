// program to check whether first no. is divisible by second or not
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter First Number : ");
        int first = sc.nextInt(); 
        
        System.out.println("Enter Second Number : ");
        int second = sc.nextInt();
        
        String str = (first % second == 0) ? "Divisible" : "Not Divisible";
        System.out.println(str);
    }
}