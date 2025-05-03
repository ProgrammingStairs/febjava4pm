// program showing the concept of linear search
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray elements : \n");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("Enter element to be search : ");
        int element = sc.nextInt();
        boolean status = false;
        for(int i=0;i<size;i++){
            if(element==arr[i]){
                status=true;
                System.out.println("Element found at position : "+(i+1));
            }
        }
        if(!status)
            System.out.println("Element not found");
    }
}