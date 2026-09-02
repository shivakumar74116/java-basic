public class incrdecrqu {
    public static void main(String[] args){

        //1
        System.out.println("Question:1");
        int a = 8;
        System.out.println(a++); //8
        System.out.println(a); //9

        //2
        System.out.println("Question:2");
        int b = 15;
        System.out.println(--b);//14
        System.out.println(b--);//14
        System.out.println(b);//13

        //3
        System.out.println("Question:3");
        int num1 = 6;
        int num2 = 9;
        System.out.println(num1++ + ++num2); //6 + 10 = 16
        System.out.println(num1); //7
        System.out.println(num2); //10

        //4
        System.out.println("Question:4");
        int x = 12;
        System.out.println(--x + x--); //11 + 12 = 22
        System.out.println(x); //10

        //5 
        System.out.println("Question:5");
        int Num1 = 5;
        int Num2 = 10;
        int Num3 = Num1++ + ++Num2 + --Num1; 
        System.out.println(Num3); // 5 + 11 + 5 = 21
        System.out.println(Num1); //5
        System.out.println(Num2); //11

        //6
        System.out.println("Question:6");
        int X = 8;
        int Y = X++ + ++X + X--;
        System.out.println(Y); // 8 + 10 + 10 = 28 Y = 28
        System.out.println(X); // 9

        //7
        System.out.println("Question:7");
        int d = 4;
        int e = 7;
        System.out.println(++d + e++ + --e + d--); // 5 + 7 + 7 + 5 = 24
        System.out.println(d); //4
        System.out.println(e); //7

        //8
        System.out.println("Question:8");
        int n = 20;
        System.out.println(n-- + --n + ++n + n++); //20 + 18 + 19 + 19 = 76
        System.out.println(n); //20

        //9
        System.out.println("Question:9");
        int p = 3;
        int q = 6;
        int r = ++p + q-- + --q + p++ + ++p; // 4 + 6 + 4 + 4 + 6 = 24
        System.out.println(r); //26
        System.out.println(p); //6
        System.out.println(q); //4

        //10
        System.out.println("Question:10");
        int num5 = 10;
        int num6 = ++num5 + num5++ + --num5 + num5-- + ++num5; // 11 + 11 + 11 + 11 + 11 = 55 
        System.out.println(num6);  //55
        System.out.println(num5); //11

        //11
        System.out.println("Question:11");
        int Num5 = 2;
        int Num6 = 5;
        int Num7 = Num5++ + ++Num6 + Num6-- + --Num5 + ++Num5 + Num5--; // 2 + 6 + 6 + 2 + 3 + 3 = 22
        System.out.println(Num7); //22
        System.out.println(Num5); //2
        System.out.println(Num6); //5








    }
    
}
