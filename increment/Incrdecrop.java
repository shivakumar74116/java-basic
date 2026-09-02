package increment;

public class Incrdecrop {
    public static void main(String[] args){

        int count = 10;
        System.out.println(count); //10
        System.out.println(count++); //10
        System.out.println(count++); //11
        System.out.println(count++); //12
        System.out.println(count); //13

        System.out.println(count--); //12
        System.out.println(count); //11
        System.out.println(count--); //11
        System.out.println(count--);

        System.out.println(++count);
        System.out.println(count);
        System.out.println(++count);
        System.out.println(++count);
        System.out.println(++count);

        System.out.println(--count);
        System.out.println(count);
        System.out.println(--count);
        System.out.println(count); //12

        System.out.println("Assignment");
        int store = count;
        store++;
        System.out.println(store);

        int count1 = 12;
        int count2 = count1++;
        System.out.println(count2);
        System.out.println(count1);

        //Behaviour in expression
        System.out.println("===Behaviour in expression====");
        int c = 10;
        System.out.println(c++ + 5); //15
        System.out.println(c);   //11
        System.out.println(++c + 5); //12 + 5 = 17
        System.out.println(c); //12

        int num1 = 10;
        System.out.println(num1++ + ++num1); //10+12=22

        













    }
    
}
