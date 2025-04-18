// program showing the concept of call by value | pass by value
/*
    Call By value : 
    1. In call by value, calling is done by passing values
    2. In call by value, copy of original data is going to be pass 
    3. In call by value, changes made on the copied data does not reflect on original data.
*/
import java.util.Scanner;
class Demo15{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping in swap : \na : "+a+"\nb : "+b); 
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();

       Demo15 obj = new Demo15();
       System.out.println("Before Swapping : \na : "+a+"\nb : "+b); 
       obj.swap(a,b); 
       System.out.println("After Swapping in main : \na : "+a+"\nb : "+b); 
    }
}

