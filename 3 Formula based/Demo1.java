// program to find out simple interest

class Demo1{
    public static void main(String args[]){
        int p = 1000, t = 4;
        double r = 2.34, si;

        si = (p*r*t)/100;
        System.out.println("Simple Interest : "+si);
        System.out.printf("Simple Interest : %.2f\n",si);
        System.out.printf("Simple Interest : %.0f\n",si);
        System.out.printf("Simple Interest : %.5f\n",si);
        System.out.printf("Simple Interest : %.10f\n",si);       
    }
}