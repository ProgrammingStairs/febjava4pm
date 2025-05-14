// example showing the concept of initializer block
/*
    static block | static initializer block
    
    static{
        .....
    }

    initializer block | instance initializer block
    
    {
        .....
    }
*/
/*
class Demo13{
    int a,b;
    //initializer block
    {
        a = 100;
        b = 200;
    }
    public static void main(String args[]){
        Demo13 obj = new Demo13();
        System.out.println("a : "+obj.a);
        System.out.println("b : "+obj.b);
    }
}
*/

class Demo13{
    final int a,b;
    {
        a = 100;
        b = 200;
    }
    Demo13(){
        // initializer block
        System.out.println("default constructor called");
    }
    public static void main(String args[]){
        Demo13 obj = new Demo13();
        System.out.println("a : "+obj.a);
        System.out.println("b : "+obj.b);
    }
}