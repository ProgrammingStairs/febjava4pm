// Example showing the concept of Thread

class Demo7 extends Thread{
    public void run(){
      System.out.println("Current Thread : "+Thread.currentThread().getName()+" isAlive : "+Thread.currentThread().isAlive());
    }
    public static void main(String args[]){
        Demo7 obj1 = new Demo7();
        Demo7 obj2 = new Demo7();
        Demo7 obj3 = new Demo7();
        obj1.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj2.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj3.start();
        System.out.println("isAlive Thread1 : "+obj1.isAlive());
        System.out.println("isAlive Thread2 : "+obj2.isAlive());
        System.out.println("isAlive Thread3 : "+obj3.isAlive());
    }
}