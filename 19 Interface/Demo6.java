// program showing the concept of Interface

interface Showable{
    void display();
}
abstract class AbstractClass{
    abstract void move();
}
class Demo6 extends AbstractClass implements Showable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void move(){
        System.out.println("move method called");
    }
    public static void main(String args[]){
        AbstractClass obj = new Demo6();
        obj.move();
        Showable obj1 = new Demo6();
        obj1.display();
    }
}