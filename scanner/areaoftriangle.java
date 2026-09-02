package scanner;
import java.util.*;
public class areaoftriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int height,base,areaoftriangle;

        System.out.println("Enter a height number: ");
        height = sc.nextInt();

        System.out.println("Enter a base number: ");
        base = sc.nextInt();

        areaoftriangle = ((height*base)/2);

        System.out.println("area of triangle: "+areaoftriangle);

        


    }
    
}
