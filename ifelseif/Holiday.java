package ifelseif;

import java.util.*;

public class Holiday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day");
        String day = sc.next();

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Holiday");
        } else {
            System.out.println("Not Holiday");
        }

        
    }
}
