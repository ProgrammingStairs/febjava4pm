// Example showing the concept of Thread

class Demo5 extends Thread{
    public void run(){
      System.out.println("Current Thread : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Demo5 obj1 = new Demo5();
        Demo5 obj2 = new Demo5();
        Demo5 obj3 = new Demo5();
        obj1.setName("UserThread-A");
        obj2.setName("UserThread-B");
        obj3.setName("UserThread-C");
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}