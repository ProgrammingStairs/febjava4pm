// program showing the concept of Operators
// Logical operator + Conditional operator

class Demo6{
    public static void main(String args[]){
        int a = 10, b=20;
        String str = (a>5 && b<10) ? "statement 1" : "statement 2";    
        System.out.println("Logical AND (&&) : "+str);

        String str1 = (a>5 || b<10) ? "statement 1" : "statement 2";    
        System.out.println("Logical OR (||) : "+str1);

        System.out.println("Logical NOT (!) : "+(!true));
        System.out.println("Logical NOT (!) : "+(!false));
        System.out.println("Logical NOT (!) : "+(!!true));
    }
}
