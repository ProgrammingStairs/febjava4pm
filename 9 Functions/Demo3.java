// program showing the concept of function
// no argument no return type
class Demo3{
    void display(){
        byte a = (byte)130;
        System.out.println("a : "+a);

        byte x = 4, y = 3, z;
        z = (byte)(x + y);
        int res = x+y;
        System.out.println("z : "+z);
        System.out.println("res : "+res);
    }
    public static void main(String args[]){
        Demo3 obj1 = new Demo3();
        obj1.display();
    }
}

