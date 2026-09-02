package condition;
import java.util.*;
public class Holiday {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day");
        String day = sc.next();
        

        if(day.equals("saturday") || day.equals("sunday")){
            System.out.println("Holiday");
        }
        else{
            System.out.println("Not Holiday");
        }

    }
    
}
