// Program showing the concept of command line argument
class Demo5{
    public static void main(String args[]){
        // System.out.println("Length : "+args.length);
        for(String str : args){
            System.out.print(str+"\t");
        }
    }
}