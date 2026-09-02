package condition;

public class Value {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 10;
        /* 
        // if (num1 == num2 ) // == work for prim data type
        if(num1.equals(num2)) // this is object invoking
        {
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
            */

        // if day = "saturday";
        String  day = "saturday";
        //if (day == "Saturday") // impompatible operands string and int
        if (day.equals(day)){
            System.out.println("holiday");
        }
        else{
            System.out.println("Not holiday");
        }
    }
    
}
