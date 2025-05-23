//  Example showing the concept of polymorphism 
// compile time polymorphism

class Demo2{
    void greater(int a,double b){
        double res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    void greater(double a,int b){
        double res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.greater(34,4.5);
        obj.greater(4.5,56);
    }   
}