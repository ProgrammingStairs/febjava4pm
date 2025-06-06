// program showing the concept of Interface
interface Movable{
    default void display(){
        System.out.println("display method called");
    }
    static void show(){
        System.out.println("show method called");
    }
}
class Demo12 implements Movable{
    public static void main(String args[]){
        Movable obj = new Demo12();
        obj.display();
        Movable.show();
    }
}