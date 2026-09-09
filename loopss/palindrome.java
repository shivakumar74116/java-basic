package loopss;
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (temp == reverse){
            System.out.println("pali");
        }
        else{
            System.out.println("Not pali");
        }
        

    }
    
}
