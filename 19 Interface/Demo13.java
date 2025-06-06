// program showing the concept of Interface
interface Movable{
    default void display(){
        System.out.println("display method called");
        printData();
    }
    default void show(){
        System.out.println("show method called");
        printData();
    }
    private void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo13 implements Movable{
    public static void main(String args[]){
        Movable obj = new Demo13();
        obj.display();
        obj.show();
    }
}