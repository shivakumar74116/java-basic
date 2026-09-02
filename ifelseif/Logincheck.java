package ifelseif;

import java.util.*;

class LoginCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a username:");
        String username = sc.next();

        System.out.println("Enter a password:");
        String password = sc.next();

        if (username.equals("Admin") && password.equals("1234")) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Login error! Check username and password");
        }

        
    }
}
