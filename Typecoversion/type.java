package Typecoversion;

public class type {
    public static void main(String[] args){

        //widing typeconversion : small to big
        System.out.println("==widing typeconversion==");
        byte a = 10;
        int b = a;
        System.out.println(b);

        //Narrowing type conversion : big to small
        System.out.println("==Narrowing type conversion==");
        int num1 = 10;
       // byte num2 = num1; //error
       //now using type casting
       byte num2 = (byte)(num1);
       System.out.println(num2);

       System.out.println("== Type promotion==");
       byte num3 = 10;
       byte num4 = 20;
       // byte num5 = num3 + num4; byte -> int
       int num5 = num3 + num4;
       System.out.println(num5);

       


    }
    
}
