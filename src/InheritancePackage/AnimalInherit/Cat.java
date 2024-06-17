package InheritancePackage.AnimalInherit;

public class Cat extends Animal{
    public void makesound(){
        System.out.println("Cat make sound is meow");
    }

    public static void main(String[] args) {
        Cat objct = new Cat();
        Animal animal = new Animal();
        animal.makesound();
        objct.makesound();
    }
}
