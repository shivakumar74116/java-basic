public class Stack 
{
    static void A()
    {
        B();
    }
    static void B(){
        c();
    }
    static void c(){
        System.out.println("hello");
    }

    public static void main(String[] args)
    {
        A();


    }
    
}
