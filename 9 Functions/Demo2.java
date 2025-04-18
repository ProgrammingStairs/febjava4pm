// program showing the concept of function

class Demo2{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        /*
        Demo2 obj1 = new Demo2(),obj2 = new Demo2();
        obj1.display();
        obj2.display();
        */
        Demo2 obj1 = new Demo2();
        obj1.display();
        obj1.display();
    }
}