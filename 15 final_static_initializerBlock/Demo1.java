/*
    Final Keyword : 
        a. Variable 
            If we make any variable as a final, then in that case we are not able to change the value of that final variable, it is going to be considered as constant.

            system Default constructor cannot set default value to final variable.

        b. Method
            If we make any method as a final, then in that case we are not able to override that specific final method. 

        c. Class 
            If we make any class as a final then in that case, it cannot be extended.
*/

class Demo1{
    final int a;
    Demo1(){
        a = 100;
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println(obj.a);
    }
}