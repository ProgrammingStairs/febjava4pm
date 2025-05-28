// Example showing the concept of Abstract class 

import java.util.Scanner;
abstract class RBI{
    RBI(){
        System.out.println("---Welcome to Bank---");
    }
    abstract double rate();
    double finalSum(int bal, double rate){
        return bal + bal * rate/100;
    }
}
class SBI extends RBI{
    @Override 
    double rate(){
        return 1.23;
    }
}
class BOI extends RBI{
    @Override 
    double rate(){
        return 2.31;
    }
}
class PNB extends RBI{
    @Override 
    double rate(){
        return 3.28;
    }
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int bal = sc.nextInt();

        RBI obj;
        obj = new SBI();
        System.out.println("Sum Provided by SBI : "+obj.finalSum(bal,obj.rate()));
        obj = new BOI();
        System.out.println("Sum Provided by BOI : "+obj.finalSum(bal,obj.rate()));
        obj = new PNB();
        System.out.println("Sum Provided by PNB : "+obj.finalSum(bal,obj.rate()));
    }
}

/*
        abstract class -----> Series
                                 abstract method --------> series(int n,int m)

        creates two classes ----> EvenSeries , OddSeries
*/