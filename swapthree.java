class Swap1{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        a = a + b; // 30
        b = a - b; // 10
        c = a - b; // 20
        a = b + c;

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);

    }
}