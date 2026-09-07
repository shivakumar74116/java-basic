package loops;
import java.util.*;
public class decre1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Starting Number");
        int num = sc.nextInt();

        // for (int i = 64; i >= 1; i = i / 2) {
        //     System.out.println(i);
        // }

        //while

        // int i = num;
        // while(i>=1){
        //     System.out.println(i);
        //     i = i/2;
        // }

        //do while

        int i = num;
        do{
            System.out.println(i);
            i= i/2;
        }
        while(i>=1);

        


    }
}