package condition;
import java.util.*;
class Admission {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks: ");
        int marks = sc.nextInt();
        System.out.println("Is passed");
        Boolean passed = sc.nextBoolean();

        if (marks >= 85){
            if(passed = true){
                System.out.println("Admission");
            }
            else{
                System.out.println("not Admision");
            }
        }

        else{
            System.out.println("Not Admissiion");
        }
    }
}
