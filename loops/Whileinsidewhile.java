package loops;

public class Whileinsidewhile {
    public static void main(String[] args) {

        // int i = 1;

        // while (i <= 3) {
        //     int j = 1;

        //     while (j <= 3) {
        //         System.out.print("* ");
        //         j++;
        //     }

        //     System.out.println();   // Just move to the next line
        //     i++;
        // }

        //do while

        // System.out.println("Do while inside do while");
        // int i = 1;
        // do
        // {
        //     int j = 1;
        //     do
        //     {
        //         System.out.print(" *");
        //         j++;
        //     }while(j<=3);

        //     System.out.println();
        //     i++;
        // }while(i<=3);

        System.out.println("For inside while");

        int i = 1;
        while(i<=3){
            for(int j = 1; j<=3; j++){
                System.out.print(" *");
            }
            System.out.println();
            i++;
        }
    }
}