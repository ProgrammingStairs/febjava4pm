class Demo2{
    final int a=200;
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        System.out.println("value of a : "+obj.a);
        final int b;
            b = 300;
            // b = 400;
        System.out.println("value of b : "+b);
    }
}