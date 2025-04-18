// program to find out compound interest

class Demo2{
    public static void main(String args[]){
        int p = 1000, t = 4;
        double r = 2.34, ci, amt;

        amt = p*Math.pow(1+r/100 , t);
        System.out.println("Amount : "+amt);
        ci = amt-p;
        System.out.println("Compound Interest : "+ci);       
    }
}