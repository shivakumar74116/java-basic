import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i<num-2; i++){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

    
}
