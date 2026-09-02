package scanner;
import java.util.*;
public class areaofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius,b ;

        System.out.println("Enter a first number");
        radius = sc.nextInt();


        b = 3.14*radius*radius;

        System.out.println(b);

    }
    
}
