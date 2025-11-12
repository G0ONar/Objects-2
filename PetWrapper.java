public class PetWrapper {
    public static void main(String[] args) {
        ShowDog showDog = new ShowDog("Buddy", 2, 7);
        SportDog sportDog1 = new SportDog("Mittens", 5, 8);
        SportDog sportDog2 = new SportDog("Nibbles", 3, 10);

        System.out.println(showDog.describe());
        System.out.println(sportDog1.describe());
        System.out.println(sportDog2.describe());
    }
}

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
