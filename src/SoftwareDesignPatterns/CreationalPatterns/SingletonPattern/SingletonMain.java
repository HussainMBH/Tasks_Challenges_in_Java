package SoftwareDesignPatterns.CreationalPatterns.SingletonPattern;

public class SingletonMain {
    public static void main(String[] args) {
        //Not possible to create an object using new keyword because the constructor is private
        //SingletonJava singletonJava = new SingletonJava();

        SingletonJava singletonJava1 = SingletonJava.getInstance();
        SingletonJava singletonJava2 = SingletonJava.getInstance();

        singletonJava1.displayMessage();
        singletonJava2.displayMessage();
    }
}
