package loopss;
import java.util.*;
public class Q2_break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alpha to break");
        char ch = Character.toUpperCase(sc.next().charAt(0));

        // for(char i= 'A'; i<='Z'; i++){
        //     if(i == ch){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        char i = 'A';
        while(i<='Z'){
            if(i == ch){
                break;
            }
        System.out.println(i);
        i++;
        }
    }
    
}
