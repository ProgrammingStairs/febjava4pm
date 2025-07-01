/*
    Thread Synchronization : 
    Synchronization is the process in which multiple threads can shares shared resources one by one. Here Thread Synchronization can be classified as : 
        1. Mutual Exclusion
           Mutual Exclusion can be achieved through : 
            i. Synchronized Block
            ii. Synchronized Method 
            iii. Static Synchronization

            Here Synchronized Block and Synchronized Method are considered as object level locking where as Static Synchronization is considered as class level locking.

        2. Inter Thread Communication (Co-Operation of Thread)
           Inter Thread Communication can be achieved through the following methods : 
            i. wait() 
            ii. notify() 
            iii. notifyAll()  
*/
// example showing the concept of synchronized block
class First{
    // creating shared resources here
    void display(String name){
        System.out.print(" [ ");

        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}

        System.out.print(name);

        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}

        System.out.println(" ] ");
    }
}
class Second extends Thread{
    First fobj;
    String name;
    Second(First fobj,String name){
        this.fobj=fobj;
        this.name=name;
        start();
    }
    @Override
    public void run(){
       synchronized(fobj){
            fobj.display(name);
       } 
    }
}
class Demo13{
    public static void main(String args[]){
        First fobj = new First();
        Second s1 = new Second(fobj,"Andrew");
        Second s2 = new Second(fobj,"Simon");
        Second s3 = new Second(fobj,"Peter");
    }
}

/*
    Shared resources 
    ----------------

        [ Andrew ]

*/

