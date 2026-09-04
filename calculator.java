import java.util.*;
public class calculator {
    public static void main(String[] args){
        
        System.out.println("Menu driven");
        System.out.println("===========");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number: ");
        int a = sc.nextInt();

        
        System.out.println("options: ");
        String options = sc.next().toUpperCase();

        System.out.println("enter a Second  number: ");
        int b = sc.nextInt();

        switch(options){
            case "ADD":
                System.out.println(a + b);
                break;
            case "SUB":
                System.out.println(a - b);
                break;
            case "MUL":
                System.out.println(a * b);
                break;
            case "DIV":
                System.out.println(a / b);
                break;
        }


    }

    
}
