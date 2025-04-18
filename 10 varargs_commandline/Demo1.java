// Program 
class Demo1{
    void test(int a){
        System.out.println("a : "+a);
    }
    void test(int a,int b){
        System.out.println("a : "+a+" b : "+b);
    }
    void test(int a,int b,int c){
        System.out.println("a : "+a+" b : "+b+" c : "+c);
    }
    void test(int a,int b,int c,int d){
        System.out.println("a : "+a+" b : "+b+" c : "+c+" d : "+d);
    }
    void test(int a,int b,int c,int d,int e){
        System.out.println("a : "+a+" b : "+b+" c : "+c+" d : "+d+" e : "+e);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.test(10);
        obj.test(10,20);
        obj.test(10,20,30);
        obj.test(10,20,30,40);
        obj.test(10,20,30,40,50);
    }
}