package loopss;
import java.util.*;
public class power {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a first number");     // inital value taken from coder. Because user give 3 it become power of 3
        // int a = sc.nextInt();

        System.out.println("Enter a second number");
        int b = sc.nextInt();

        // for (int i = 1; i<=b; i=i*2){
        //     System.out.println(i);
        // }

        //while 

        // int i = 1;
        // while(i<=b){
        //     System.out.println(i);
        //     i= i*2;
        // }

        //do while

        int i = 1;
        do{
            System.out.println(i);
            i=i*2;
        }
        while(i<=b);



    }
    
}
