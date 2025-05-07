// Example showing the concept of multi dimensional array
/*
    1d array 
     int arr[] = new int[5];

    2d array
     int arr[][] = new int[3][3];

    multi dimensional array : It is a collection of 2d array

     int arr[][][] = new int[no.of 2d array][no. of rows][no. of columns];
     int arr[][][] = new int[2][3][3];
                           __|_______
                          |          |
                        1 2 3      2 3 4
                        3 4 5      8 7 8
                        3 2 3      3 2 2 
                            3x3        3x3
*/
import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
        int arr[][][] = new int[][][]{
            {
                {2,3,4},
                {5,6,7},
                {8,8,8}
            },{
                {2,3,4},
                {5,5,6},
                {5,5,5}
            }
        };
        System.out.println("Array elements are : ");
        for(int ar[][] : arr){
            for(int a[] : ar){
                for(int element : a){
                    System.out.print(element+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}