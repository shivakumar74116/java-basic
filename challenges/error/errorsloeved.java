package challenges.error;

 class errorsloeved {
    // return type mismatch
    static String add() {
        return "Hello";

    }

    public  static void main(String[] args){
        // syntax error
        int a = 10;
        System.out.println(a);

        //logical error
        int num1 = 10;
        int num2 = 20;
        System.out.println(num2-num1);

        //type miss match error
        double num3 = 10.13;
        System.out.println(num3);

        //duplicate error
        int age = 22;
         age = 23;
        System.out.println(age);

        //local variable is not initialised
        int marks = 60;
        System.out.println(marks);

        //wrong method
        int num4 = 20;
        System.out.println(num4);

        //case sensitive error
        int num5 = 40;
        System.out.println(num5);

        //miss curly bracess
        if (marks>=60){
            System.out.println(marks);
        }
        


    } 
    
}
