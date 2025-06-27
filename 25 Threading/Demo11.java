// Example showing the concept of Thread

class Demo11 implements Runnable{
    @Override 
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        Thread th1 = new Thread(obj);
        Thread th2 = new Thread(obj);
        th1.start();
            try{
                // th1.join();
                th1.join(5000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        th2.start();
    }
}