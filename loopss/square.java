package loopss;
import java.util.*;
class squareofeachnumber //print the square of each number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int start = sc.nextInt();

        System.out.println("Enter a end number");
        int end = sc.nextInt();

        // for(int i=start; i<=end; i++){
            
        //     System.out.println(i*i);
        // }

        // int i = start;
        // while(i<=end){
        //     System.out.println(i*i);
        //     i++;
        // }

        int i = start;
        do{
            System.out.println(i*i);
            i++;
        }
        while(i <= end);
            



    }
    
}
