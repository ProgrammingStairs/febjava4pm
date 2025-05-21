// example showing the concept of Inheritance
import java.util.Scanner;
class Area{
    // data members
    int l,b;
    // constructor
    Area(int l,int b){
        this.l=l;
        this.b=b;
    }
    // member function
    int getArea(){
        return l*b;
    }
}
class Volume extends Area{
    // data member
    int h;
    // constructor
    Volume(int l, int b, int h){
        super(l,b);
        this.h=h;
    }
    // member function
    int getVolume(){
        return getArea()*h;
    }
}
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b and h : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        Volume obj = new Volume(l,b,h);
        System.out.println("Area : "+obj.getArea());
        System.out.println("Volume : "+obj.getVolume());
    }
}