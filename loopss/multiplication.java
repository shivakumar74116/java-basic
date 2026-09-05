package loopss;
import java.util.*;
public class multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to multiplication");
        int num = sc.nextInt();
        
        // for(int i = 1; i<=10; i++){
        //     System.out.println(num + "X"+ i + "=" + i*num);
        // }

        //while

        // int i = 1;
        // while(i<=10){
        //     System.out.println(num + " X " + i+ " = "+ i*num);
        //     i++;
        // }

        //do while

        int i = 1;
        do{
           
            System.out.println(num + " X " + i+ " = "+ i*num);
             i++;
            
        }
        while(i<=10);

    }
    
}
