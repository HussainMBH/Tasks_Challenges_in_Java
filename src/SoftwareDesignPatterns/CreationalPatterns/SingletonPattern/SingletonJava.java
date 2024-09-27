package SoftwareDesignPatterns.CreationalPatterns.SingletonPattern;

public class SingletonJava {
    private static SingletonJava singletonJava;

    //Create private Constructor
    private SingletonJava(){

    }

    //Create a static method to get instance
    public static SingletonJava getInstance(){
        if(singletonJava == null){
            singletonJava = new SingletonJava();
        }
        return singletonJava;
    }

    public void displayMessage(){
        System.out.println("I have called using singleton object");
    }
}
