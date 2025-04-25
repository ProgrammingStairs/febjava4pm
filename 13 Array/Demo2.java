// program showing the concept of Array
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("\nEnter Array elements : \n");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }        

        System.out.println("\nArray elements are : ");
        for(int element : arr){
            System.out.print(" "+element); 
        }        
    }
}