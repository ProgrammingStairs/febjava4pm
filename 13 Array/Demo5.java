// program to insert an element at specific index
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index : ");
        int index = sc.nextInt();
        System.out.println("Enter element : ");
        int element = sc.nextInt();

        for(int i=size-1;i>=index;i--){
             arr[i+1] = arr[i];
        }        
        arr[index] = element;

        System.out.println("\nEnter Array elements : \n");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}