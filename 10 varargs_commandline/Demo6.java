// Program showing the concept of command line argument
class Demo6{
    public static void main(String args[]){
        int sum=0;
        for(String str : args){
            sum += Integer.parseInt(str);
        }
        System.out.print("Sum : "+sum);
    }
}