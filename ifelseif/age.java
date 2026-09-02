package ifelseif;

import java.util.*;

class AgeCategory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 60) {
            System.out.println("Young Adult");
        } else {
            System.out.println("Senior Citizen");
        }

        
    }
}
