package operators;

public class operators {

    public static void main(String[] args){
        int a = 10;
        int b = 20;

        
        System.out.println("A:"+a);
        System.out.println("B:"+b);

        System.out.println();

        //Arithmetic operators 
        System.out.println("Addition: " + (a + b));
        System.out.println("subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Devision : " + (a / b));
        System.out.println("Modulus : " + (a % b));

        // increment and decrement

        System.out.println("increment:"+(++a));
        System.out.println("decrement:"+(--b));

        //perception
        int A = 10;
        int B = 20;
        double C = A + A * B / A;
        System.out.println(C);
        
        // Boolean
        boolean x = true;
        boolean y = false;
        // System.out.println(x+y);  cant add true and flase in java it comes error

        //integer and float

        int num1 = 10;
        float num2 = 10.5f;
        System.out.println("int + float: "+ (num1+num2));
        System.out.println("int - float: "+ (num1 - num2));
        System.out.println("int * float: "+ (num1 * num2));
        System.out.println("int / float: "+ (num1 / num2));
        System.out.println("int % float: "+ (num1 % num2));


        






    }
    
}
