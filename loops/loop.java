package loops;
import java.util.*;
public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number");
        int num2 = sc.nextInt();

        // for(int i = num1; i<=num2; i=i*10){
        //     System.out.println(i);
        // }

        //while

        // int i = num1;
        // while(i<=num2){
        //     System.out.println(i);
        //     i = i * 10;
        // }

        //do while

        int i = num1;
        do{
            System.out.println(i);
            i = i * 10;
        }
        while(i<=num2);
    }
    
}
