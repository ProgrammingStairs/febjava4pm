// program showing the concept of Interface

interface Showable{
    void display(); // public abstract void display();
}
interface Movable{
    void move();
    void display(); // public abstract void display();
}

class Demo4 implements Showable,Movable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void move(){
        System.out.println("move method called");
    }
    public static void main(String args[]){
        /*
        Showable obj = new Demo4();
        obj.display();
        Movable obj1 = new Demo4();
        obj1.move();
        */
        
        Demo4 obj = new Demo4();
        obj.display();
        obj.move();
    }
}