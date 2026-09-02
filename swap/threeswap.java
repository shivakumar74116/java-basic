package swap;

public class threeswap {
    public static void main(String[] args){
        int a= 10;
        int b = 20;
        int c = 30;

        a = a + b;
        b = a - b;
        a = a - b;

        b = c + b;
        c = b - c;
        b = b - c;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
    
}
