//  Example showing the concept of polymorphism 
// compile time polymorphism

class Demo1{
    void greater(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    void greater(int a,int b,int c){
        int res = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("Greater number : "+res);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.greater(34,45);
        obj.greater(45,56,67);
    }   
}