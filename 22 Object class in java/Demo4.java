// Program showing the concept of getClass() method

class Demo4{
    public static void main(String args[]){
        /*
        Object obj = new String();
        Class c = obj.getClass();
        String name = c.getName();
        System.out.println("Name : "+name);
         */

        /*
        Object obj = new String();
        System.out.println("Name : "+obj.getClass().getName());
        */

        System.out.println("Name : "+new String().getClass().getName());
        System.out.println("Name : "+new Demo4().getClass().getName());
       
    }
}
