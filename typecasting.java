// class widening 
// {
//     public static void main(String[] args) 
//     {
//         int num = 100;
//         int result = num;
//         System.out.println("Result: "+result);
//     }
    
// }

// Narrrowing : larger data into small data type

class narrow{
    public static void main(String[] args) {
        int num = 100;
        byte result = (byte)num;

        System.out.println(result);
        
    }
}