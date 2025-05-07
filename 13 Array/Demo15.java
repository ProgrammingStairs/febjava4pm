class Demo15{
    public static void main(String args[]){
        boolean bool[] = new boolean[5];
        for(int i=0;i<bool.length;i++){
            System.out.print(bool[i]+"\t");
        }
        System.out.println();
        String str[] = new String[5];
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        byte bt[] = new byte[5];
        for(int i=0;i<bt.length;i++){
            System.out.print(bt[i]+"\t");
        }
        System.out.println();
        byte bt1[] = new byte[]{65,66,67,68,69};
        for(int i=0;i<bt1.length;i++){
            System.out.print((char)bt1[i]+"\t");
        }
    }
}