// program showing the concept of if statement

class Demo1{
    public static void main(String args[]){
        if(false){
            System.out.println("statement 1");
        }
        if(true)
            System.out.println("statement 2");
        if(5>2)
            System.out.println("statement 3");
        if(!true)
            System.out.println("statement 4");
        if(!!true)
            System.out.println("statement 5");
        if(false || true)
            System.out.println("statement 6");
        if(false && true)
            System.out.println("statement 7");
        if(true || false && false)
            System.out.println("statement 8");
    }
}