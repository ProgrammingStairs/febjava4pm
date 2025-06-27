// Example showing the concept of Thread

class Demo12{
    public static void main(String args[]){
        /*
        Runnable obj = new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        };
        Thread td = new Thread(obj);
        td.start();
        */
       /*
        Thread td = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        });
        td.start();
        */
       /* 
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        }).start();
       */
      /*
      Thread th = new Thread(){
        @Override
        public void run(){
            System.out.println("run method executes");
        }
      };
      th.start();
      */
     /*
      new Thread(){
        @Override
        public void run(){
            System.out.println("run method executes");
        }
      }.start();
     */
    /*
        Runnable obj = ()->System.out.println("Run method executes");
        Thread td = new Thread(obj);
        td.start();
    */
    /*
        Thread td = new Thread(()->System.out.println("Run method executes"));
        td.start();
   */

     new Thread(()->System.out.println("Run method executes")).start();
    }
}

