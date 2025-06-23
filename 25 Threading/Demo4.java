// Example showing the concept of Thread

class Demo4 extends Thread{
    public void run(){
      System.out.println("Current Thread : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();
        Demo4 obj3 = new Demo4();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}