package JavaKeyWords;

public class SuperandThisKeyWord {
    int age; //global Variable

    public static void main(String[] args) {
        SuperandThisKeyWord sp = new SuperandThisKeyWord();
        sp.Setage(25);
    }

    public void Setage(int age){
        this.age = age; // --> this one is local variable
        System.out.println(age);
    }
}
