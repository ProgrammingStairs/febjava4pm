// example showing the concept of Multilevel Inheritance
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
class Density extends Volume{
    double m;
    Density(int l,int b,int h,double m){
        super(l,b,h);
        this.m=m;
    }
    double getDensity(){
        return m/getVolume();
    }
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b,h and m : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        double m = sc.nextDouble();

        Density obj = new Density(l,b,h,m);
        System.out.println("Area : "+obj.getArea());
        System.out.println("Volume : "+obj.getVolume());
        System.out.println("Density : "+obj.getDensity());
    }
}