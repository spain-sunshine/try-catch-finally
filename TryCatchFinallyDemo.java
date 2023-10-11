public class TryCatchFinallyDemo{
    public static void main(String[] args){
        System.out.println("Before try block");

        try{
            System.out.println("Start of try block");
            // Uncomment the line below to simulate an exception
            int result = 10 / 0;
            System.out.println("End of try block");
        }catch(ArithmeticException e){
            System.out.println("Caught an exception:" + e.getMessage()) ;

        }finally{
            System.out.println("Inside finally block");
        }
        System.out.println("After try-catch-finally block");
    }
}