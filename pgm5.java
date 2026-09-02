public class pgm5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping");
        System.out.println("----------------");
        System.out.println("num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("\n");
        


        int temp=num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping");
        System.out.println("---------------");

        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        
    }
    
}
