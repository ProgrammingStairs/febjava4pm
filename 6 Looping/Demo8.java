// n odd numbers
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(2*i-1+"\t");
        }
    }
}