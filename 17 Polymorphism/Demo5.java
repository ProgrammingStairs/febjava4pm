//  Example showing the concept of polymorphism 
// method overriding

class Parent{
    void shape(){
        System.out.println("It's a Shape");
    }
}
class Circle extends Parent{
    @Override
    void shape(){
        System.out.println("It's Circle Shape");
    }
}
class Rectangle extends Parent{
    @Override
    void shape(){
        System.out.println("It's Rectangle Shape");
    }
}
class Square extends Parent{}

class Demo5{
    public static void main(String args[]){
        Circle cobj = new Circle();
        cobj.shape();
        Rectangle robj = new Rectangle();
        robj.shape();
        Square sobj = new Square();
        sobj.shape();
    }   
}