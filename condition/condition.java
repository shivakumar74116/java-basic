package condition;
import java.util.*;
public class condition {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a age: ");
        // int age = sc.nextInt();

        // if (age >= 22){
        //     System.out.println("Eligible");
        // }
        // else if (age > 18 && age > 0 ){
        //     System.out.println("Not Eligible");
        // }

        // else{
        //     System.out.println("Invalid");
        // }


        //Nested
/* */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age: ");
        int age = sc.nextInt();
        System.out.println("Indian Citizenship:True/false");
        Boolean citizen = sc.nextBoolean();

        if(age >= 18){
            if(citizen){
                System.out.println("Eligible");
            }
            else{
                System.out.println("not eligible");
            }
        }
        else{
            System.out.println("Age less than 18");
        }
        
        
    }
    
}
