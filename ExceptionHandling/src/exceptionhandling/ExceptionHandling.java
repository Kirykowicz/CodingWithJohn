package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        
        printInt("12a");

    }

    private static void printInt(String numberString){
        try{
            int myInt = Integer.parseInt(numberString);
            System.out.println(myInt);
        } catch(NumberFormatException nfe) {
            System.out.println("---Caught a number format exception---");
        } finally {
            System.out.println("finally always runs whether or not there is an exception");
        }
    }
}
