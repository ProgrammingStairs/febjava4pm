// number is armstrong or not
/*
    num = 153
        digits = 3
        1^3 + 5^3 + 3^3
        1 + 125 + 27
    153 armstrong

    num = 75
        digits = 2
        7^2 + 5^2
        49 + 25
    74 not armstrong

    num = 5
        digit = 1
        5^1
    5 armstrong
*/
import java.util.Scanner;
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count=0,rem;
        double sum=0;
        int temp = num;
        int temp1 = num;
        while(num>0){
            count++;
            num = num/10; 
        }
        while(temp>0){
            rem = temp%10;
            sum = sum + Math.pow(rem,count);
            temp = temp/10;
        }
        if(sum == temp1)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }
}