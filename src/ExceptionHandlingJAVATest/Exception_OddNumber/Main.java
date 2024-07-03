package ExceptionHandlingJAVATest.Exception_OddNumber;

public class Main {
    public static void main(String[] args) {
        int n = 18;
        trynumber(n);
        n = 7;
        trynumber(n);
    }

    public static void trynumber(int n){
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        }catch (IllegalAccessException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) throws IllegalAccessException{
        if(number % 2 != 0){
            throw new IllegalAccessException(number + " is odd.");
        }
    }
}
