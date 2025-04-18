// program showing the concept of function
// no argument no return type
class Demo4{
    void display(){
        int a = 012; // octal number system
        System.out.println("a : "+a);

        int b = 0x12; // hexadecimal number system
        System.out.println("b : "+b);
    }
    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        obj1.display();
    }
}

/*
    012
    1 x 8 ^ 1 + 2 x 8 ^ 0
    1 x 8 + 2 x 1
    8 + 2
    10

    0x12
    1 x 16 ^ 1 + 2 x 16 ^ 0
    1 x 16 + 2 x 1
    16 + 2
    18

*/