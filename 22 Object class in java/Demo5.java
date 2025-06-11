// Program showing the concept of finalize() method  

@Deprecated
class Demo5{
    protected void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("HashCode : "+obj.hashCode());
        obj = null;
        System.gc();
    }
}
