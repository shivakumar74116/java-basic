package Typecoversion;

class Today {

    public static void main(String [] args){
        //demo of byte and byte
        byte num1 = 10;
        byte num2 = 20;
        // byte num3 = num1 + num2; wrong lossy conversion
        int num3 = num1 + num2; // Type Promotion
        System.out.println(num3);

        //Demo byte and short
        byte num4 = 100;
        short num5 = 200;
        //byte num6 = num4+num5; Wrong lossy conversion
        int num6 = num4 +num5; // Type promotion
        System.out.println(num6);

        //byte and int 
        byte num7 = 40;
        int num8 = 200;
        //byte  num9 = num7 + num8;  wrong lossy conversion
        int num9 = num7+num8;
        System.out.println(num9);

        //byte and long 
        byte num10 = 67;
        long num11 = 101000;
        long num12 = num10 + num11;
        System.out.println(num12);

        //short and int 
        short num13 = 256;
        int num14 = 756;
        int num15 = num13 + num14;
        System.out.println(num15);

        //short and short
        short num16 = 134;
        short num17 = 155;
        // short num18 = num16 + num17; // Wrong lossy conversion
        int num18 = num16 + num17;
        System.out.println(num18);

        //short and long
        short num19 = 22;
        long num20 = 7576576;
        long num21 = num19 + num20;
        System.out.println(num21);

        //int and int
        int num22 = 224;
        int num23 = 234;
        int num25 = num22+num23;
        System.out.print(num25);

        //int and long 
        int num26 = 437;
        long num27 = 657657;
        long num28 = num26 + num27;
        System.out.println(num28);

        //long and long
        long num29 = 565;
        long num30 = 45456565;
        long num31 = num29 + num30;
        System.out.println(num31);

        //float and byte
        float num32 = 34.0f;
        byte num33 = 23;
        float num34 = num32 + num33;
        System.out.println(num34);

        //float and short
        float num35 = 34.0f;
        short num36 = 23;
        float num37 = num35 + num36;
        System.out.println(num37);

        //float and int
        float num38 = 25.00f;
        int num39 = 89;
        float num40 = num38 + num39;
        System.out.println(num40);

        //float + long --> float
        float num41 = 35.0f;
        long num42 = 3;
        float num43 = num41 + num42;
        System.out.println(num43);

        //float + float --> float
        float num44 = 35.0f;
        float num45 = 35.0f;
        float num46 = num44 + num45;
        System.out.println(num46);

        //char and char --> char
        char 



    }
    
}
