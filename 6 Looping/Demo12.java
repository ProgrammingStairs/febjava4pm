// number is palindrome or not
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        System.out.println("Original Number : "+num);
        int rev=0,rem;
        while(num>0){
            rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(temp==rev)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}

