// Example showing the concept of Abstract class 

abstract class Parent{
    abstract void shape();
}
class Circle extends Parent{
    @Override 
    void shape(){
        System.out.println("Its Circle Shape");
    }
}
class Rectangle extends Parent{
    @Override 
    void shape(){
        System.out.println("Its Rectangle Shape");
    }
}
class Square extends Parent{
    @Override 
    void shape(){
        System.out.println("Its Square Shape");
    }
}
class Demo3{
    public static void main(String args[]){
        Parent obj;
        obj = new Circle();
        obj.shape();
        obj = new Rectangle();
        obj.shape();
        obj = new Square();
        obj.shape();     
    }
}