//  Example showing the concept of polymorphism 
// compile time polymorphism | constructor overloading

class Demo3{
    Demo3(int a,double b){
        double res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    Demo3(double a,int b){
        double res = a>b?a:b;
        System.out.println("Greater number : "+res);
    }
    public static void main(String args[]){
        new Demo3(34,4.5);
        new Demo3(4.5,56);
    }   
}