// program 
import java.util.Scanner;
class Demo14{
    int a = 100;
    void showData(Demo14 object){
        System.out.println("Default string representation of object : "+object);
        System.out.println("value of a : "+object.a);
    }
    void printData(){
        System.out.println("value of a : "+a);
        this.a = 500; // a = 500;
        showData(this);
    }
    public static void main(String args[]){
        Demo14 obj = new Demo14();
        obj.printData();
    }
}

