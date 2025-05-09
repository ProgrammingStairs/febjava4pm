/*
    Singleton class : 
    Singleton class is a class, which can have only one object at a time and if we want to create another object then in that case the new reference variable also points to the previously object created. 

    For making any class as a singleton class, we need to follows two rules : 
    
    Rule 1 : Make constructor private, so that we cannot able to create object of that class from outside. 

    Rule 2 : Make a static method, which return object of that singleton class and whose return type is of that specific singleton class

    We can perform Eager Initialization and Lazy Initialization in creation of singleton class object.
*/
// Lazy Initialization
class Singleton{
    static private Singleton obj;
    private Singleton(){}
    static Singleton getInstance(){
        System.out.println("object before if : "+obj);
        if(obj==null){
            System.out.println("object inside if : "+obj);
            obj = new Singleton();
        }
        System.out.println("object after if : "+obj);
        return obj;
    }
    int a=100;
    static void display(){
        System.out.println(obj);
    }
}
class Demo6{
    public static void main(String args[]){
        Singleton.display();
        Singleton s1 = Singleton.getInstance();
        System.out.println("value of a : "+s1.a);
        s1.a+=200;
        System.out.println("value of a : "+s1.a);
        Singleton s2 = Singleton.getInstance();
        System.out.println("value of a : "+s2.a);
    }
}
