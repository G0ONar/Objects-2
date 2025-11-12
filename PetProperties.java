public class PetProperties {
    //Pet types

    //show dogs
    class ShowDog extends Pet {
    private int groomingLevel;

    public ShowDog(String name, int age, int groomingLevel) {
        super(name, "Show Dog", age);
        this.groomingLevel = groomingLevel;
    }

    @Override
    public String describe() {
        return super.describe() + " Grooming Level: " + groomingLevel;
    }
    //sport dogs
    class SportDog extends Pet {
    private int speed; // higher = faster

    public SportDog(String name, int age, int speed) {
        super(name, "Sport Dog", age);
        this.speed = speed;
    }

    @Override
    public String describe() {
        return super.describe() + " Speed: " + speed;
    }

    public int getSpeed() {
        return speed;
    }

}

class Pet {
    protected String name;
    protected String type;
    protected int age;
    protected int energy;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.energy = 100;
    }

    public void play(int minutes) {
        energy -= minutes * 2;
        if (energy < 0) energy = 0;
        System.out.println(name + " played for " + minutes + " minutes.");
    }

    public void feed(int foodAmount) {
        energy += foodAmount * 5;
        if (energy > 100) energy = 100;
        System.out.println(name + " was fed " + foodAmount + " units of food.");
    }

    public String describe() {
        return name + " the " + type + " (age " + age + ") has " + energy + "% energy.";
    }
}