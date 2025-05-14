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
class Demo12{
    public static void main(String args[]){
        int a = 100;
        // normal block
        {
            int b = 200;
            System.out.println("value of a : "+a);
            System.out.println("value of b : "+b);
        }
//        System.out.println("value of b : "+b);
    }
}