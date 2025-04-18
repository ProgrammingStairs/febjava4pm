// program showing the concept of switch control statement
class Demo14{
    public static void main(String args[]){
        switch(0){
            default : System.out.println("default statement executes");
                        break;
            case 3 : System.out.println("statement 1");
                        break;
            case 6 : System.out.println("statement 2");
                        break;
            case -2 : System.out.println("statement 3");
                        break;
            case 0 : System.out.println("statement 4");
                        break;
            case 1 : System.out.println("statement 5");
                        break;
        }
    }
}