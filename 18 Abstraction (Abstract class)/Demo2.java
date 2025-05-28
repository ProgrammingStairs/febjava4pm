// Example showing the concept of Abstract class 

abstract class AbstractClass{
    abstract void display();
}
class Demo2{
    public static void main(String args[]){
        /*
        AbstractClass obj = new AbstractClass(){
          @Override
          void display(){
              System.out.println("display method called");
          }  
        };
        obj.display();
        */

        new AbstractClass(){
          @Override
          void display(){
              System.out.println("display method called");
          }  
        }.display();
    }
}