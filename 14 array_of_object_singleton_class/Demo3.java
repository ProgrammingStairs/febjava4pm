// Example
import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ProductId : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ProductName : ");
        name = sc.nextLine();
        System.out.println("Enter ProductPrice : ");
        price = sc.nextDouble();        
    }
    void display(){
            System.out.println(pid+" "+name+" "+price);
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of product : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num]; // reference array
        for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        System.out.println("Product Details : ");
        for(Product p : pobj){
            p.display();
        }
    }
}