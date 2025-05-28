// Example showing the concept of Abstract class 

abstract class RBI{
    abstract double rate();
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
class Demo4{
    public static void main(String args[]){
        RBI obj;
        obj = new SBI();
        System.out.println("Rate by SBI : "+obj.rate());
        obj = new BOI();
        System.out.println("Rate by BOI : "+obj.rate());
        obj = new PNB();
        System.out.println("Rate by PNB : "+obj.rate());
    }
}