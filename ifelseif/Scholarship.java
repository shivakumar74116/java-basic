package ifelseif;

import java.util.*;

class Scholarship {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        System.out.println("Enter family income:");
        int income = sc.nextInt();

        if ((marks >= 80) && (income <= 40000)) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }

        
    }
}