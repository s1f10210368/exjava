package lecture5.ex2;

public class Main {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Eat and run
        human.eat();
        dog.eat();
        cat.eat();
        human.run();
        dog.run();
        cat.run();

        System.out.println("Human's stomach: " + human.getStomach());
        System.out.println("Dog's stomach: " + dog.getStomach());
        System.out.println("Cat's stomach: " + cat.getStomach());

        // Bark and talk
        if (dog instanceof Barkable) {
            Barkable barker = (Barkable) dog;
            System.out.println("Dog says: " + barker.bark());
        }

        if (cat instanceof Barkable) {
            Barkable barker = (Barkable) cat;
            System.out.println("Cat says: " + barker.bark());
        }

        if (human instanceof Human) {
            Human speaker = (Human) human;
            System.out.println("Human says: " + speaker.talk());
        }
    }
}

