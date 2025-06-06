// program showing the concept of Interface
interface Movable{
    default void display(){}
}
interface Showable{
    default void display(){}
}

class Demo14 implements Movable,Showable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo14 obj = new Demo14();
        obj.display();
    }
}