package swap;
class swapwithtemp
{
    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c = 30;
        int temp ;

        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);



    }

}