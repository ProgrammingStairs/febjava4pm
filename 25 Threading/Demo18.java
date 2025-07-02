// program showing the concept of deadlock

class Pen{}
class Paper{}
class Demo18{
    public static void main(String args[]){
        Pen pn = new Pen();
        Paper pr = new Paper();

        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 1 uses Pen and needs Paper");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pr){
                        System.out.println("Thread 1 uses Paper and needs Pen");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 2 uses Paper and needs Pen");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pn){
                        System.out.println("Thread 2 uses Pen and needs Paper");
                    }
                }
            }
        }.start();
    }
}