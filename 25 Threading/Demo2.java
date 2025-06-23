// Example showing the concept of Thread

class Demo2{
    void myFun(){
        System.out.println("Current Thread : "+Thread.currentThread());
        System.out.println("Current Thread : "+Thread.currentThread().getName());
        System.out.println("Current Thread : "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.myFun();
    }
}