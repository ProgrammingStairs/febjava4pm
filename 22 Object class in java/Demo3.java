// Program showing the concept of equals() method

class Complex{
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo3{
    public static void main(String args[]){
       Complex c1 = new Complex();
       Complex c2 = new Complex();
       System.out.println("equals : "+c1.equals(c2));
    }
}
