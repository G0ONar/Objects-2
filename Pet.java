//By Gunnar Pettit
//For Kim Gross
//Software Development
public class Main {
     static class Pet {
        private String name;
        private String species;
        private int age;
        private int energy;

        public Pet(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
            this.energy = 100;
        }

        public String describe() {
            return name + " is a " + age + "-year-old " + species + " with " + energy + "% energy.";
        }

        public void play(int minutes) {
            if (energy <= 0) {
                System.out.println(name + " is too tired to play.");
            } else {
                int energyLoss = minutes * 5;
                energy = Math.max(0, energy - energyLoss);
                System.out.println(name + " played for " + minutes + " minutes and now has " + energy + "% energy.");
            }
        }

        public void feed(int foodAmount) {
            int energyGain = foodAmount * 10;
            energy = Math.min(100, energy + energyGain);
            System.out.println(name + " ate and now has " + energy + "% energy.");
        }
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", "dog", 3);
        Pet pet2 = new Pet("Mittens", "cat", 2);
        Pet pet3 = new Pet("Nibbles", "hamster", 1);

        System.out.println(pet1.describe());
        pet1.play(10);
        pet1.feed(3);
        System.out.println(pet1.describe());
        System.out.println();

        System.out.println(pet2.describe());
        pet2.play(5);
        pet2.feed(2);
        System.out.println(pet2.describe());
        System.out.println();

        System.out.println(pet3.describe());
        pet3.play(8);
        pet3.feed(1);
        System.out.println(pet3.describe());
    }
}
