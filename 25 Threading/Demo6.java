// Example showing the concept of Thread

class Demo6 extends Thread{
    public void run(){
      System.out.println("Current Thread : "+Thread.currentThread().getName()+" isAlive : "+Thread.currentThread().isAlive());
    }
    public static void main(String args[]){
        Demo6 obj1 = new Demo6();
        Demo6 obj2 = new Demo6();
        Demo6 obj3 = new Demo6();
        obj1.start();
        obj2.start();
        obj3.start();
        System.out.println("isAlive Thread1 : "+obj1.isAlive());
        System.out.println("isAlive Thread2 : "+obj2.isAlive());
        System.out.println("isAlive Thread3 : "+obj3.isAlive());
    }
}