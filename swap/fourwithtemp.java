package swap;
class Four{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int temp;

        temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);

    }
}