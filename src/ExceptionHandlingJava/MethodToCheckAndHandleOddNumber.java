package ExceptionHandlingJava;

public class MethodToCheckAndHandleOddNumber {
    public static void main(String[] args) {
        int n = 18;
        trynumber(n);
        n = 11;
        trynumber(n);
    }

    public static void trynumber(int n){
        try {
            checkEvenNumber(n);
            System.out.println(n + " is Even.");
        }
        catch (IllegalAccessException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) throws IllegalAccessException {
        if(number % 2 != 0){
            throw new IllegalAccessException(number + " is odd.");
        }
    }
}
