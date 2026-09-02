package ifelseif;

import java.util.Scanner;

class CollegeAdmission {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        System.out.println("Enter whether he has passed the exam (true/false):");
        boolean passedExam = sc.nextBoolean();

        if ((marks >= 85) && (passedExam == true)) {
            System.out.println("Admission");
        } else {
            System.out.println("Not Admission");
        }

        
    }
}