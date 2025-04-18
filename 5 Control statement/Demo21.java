// program showing the concept of switch control statement
import java.util.Scanner;
class Demo21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt(); // 10
        int i=1;
        switch(i++){ // i=1 
            case -3 : num++;
            case 4 : --num;
                        break;
            case 1 : --num; // 9
            case 0 : num--; // 9
            case 7 : num = num+10; // 18 
            default : System.out.println("Number : "+num);
                        break;
        }
    }
}

