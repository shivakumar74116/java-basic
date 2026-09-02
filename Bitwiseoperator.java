public class Bitwiseoperator {
    public static void main(String[] args){
        int x = 10;
        int y = 6;
        System.out.println("And operator: "+(x & y));
        System.out.println("Or operator: "+(x | y));
        System.out.println("And operator: "+(x ^ y));
        System.out.println("NOT operator: "+(~x));
        System.out.println("NOT operator: "+(~y));

        System.out.println("left shift ");
        int a = 10;
        System.out.println("left shift by 1: "+(a << 1));
        System.out.println("left shift by 2: "+(a << 2));
        System.out.println("left shift by 3: "+(a << 3));

        System.out.println("Right Shift");
        System.out.println("Right shift by 1: "+(a >> 1));
        System.out.println("Right shift by 2: "+(a >> 2));
        System.out.println("Right shift by 3: "+(a >> 3));

        System.out.println("unsigned Right Shift");
        int b = -10;
        System.out.println("unsigned Right Shift by 1"+(b >>> 1));
        System.out.println("unsigned Right Shift by 2"+(b >>> 2));
        System.out.println("unsigned Right Shift by 3"+(b >>> 3));
        
        




    }
    
}
