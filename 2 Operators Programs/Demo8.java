// program showing the concept of Operators
// Increment Decrement operator
class Demo8{
    public static void main(String args[]){
        int a = 10, b=10, c=10, d=10,data;
        // data = a++ + --b + --c + d-- + d++;  
        // System.out.println("data : "+data); // 47

        //  data = --c + --c + --c + d++ + d--; // 45
        //  System.out.println("data : "+data);

        // data = a++ + ++b + c-- + d++ + d++;
        // System.out.println("data : "+data);

        data = a++ + --b + c-- + d++ + ++c;
        System.out.println("data : "+data);
    }
}
