package scanner;

import java.util.*;
public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a first Number: ");
        a = sc.nextInt();
        System.out.println("Enter a second Number: ");
        b = sc.nextInt();

        c = a + b;

        System.out.println(c);

    }
    
}
