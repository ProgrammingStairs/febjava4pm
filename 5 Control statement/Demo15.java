// program showing the concept of switch control statement
// error : duplicate case value
class Demo15{
    public static void main(String args[]){
        char ch='a';
        switch(ch){
            case 'a' : System.out.println("character");
                        break;
            case 97 : System.out.println("ascii value");
                        break;
            default : System.out.println("default statement executes");
                        break;
        }
    }
}