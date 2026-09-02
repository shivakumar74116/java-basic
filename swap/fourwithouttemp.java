package swap;

public class fourwithouttemp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        // swap a and b

        a = a + b;
        b = a - b;
        a = a - b;

        //swap b and c

        b = b + c;
        c = b - c;
        b = b - c;

        //swap c and d 
        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);
    }
    
}
