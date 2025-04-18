// program
import java.util.Scanner;
class Demo16{
    int a,b;
    void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    void swap(Demo16 obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("After Swapping in swap : \na : "+obj.a+"\nb : "+obj.b); 
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();

       Demo16 obj = new Demo16();
       obj.setData(a,b);
       System.out.println("Before Swapping : \na : "+obj.a+"\nb : "+obj.b); 
       obj.swap(obj); 
       System.out.println("After Swapping in main : \na : "+obj.a+"\nb : "+obj.b); 
    }
}

