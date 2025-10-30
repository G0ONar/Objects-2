public class PetRace {
    class DogRace {
    public static void startRace(SportDog... dogs) {
        Random rand = new Random();
        double bestTime = Double.MAX_VALUE;
        SportDog winner = null;

        System.out.println("\n🏁 The race is starting! 🏁\n");

        for (SportDog dog : dogs) {
            // Race time depends on speed and randomness
            double raceTime = 10.0 - dog.getSpeed() * 0.3 + rand.nextDouble() * 2;
            System.out.printf("%s finished the race in %.2f seconds!\n", dog.name, raceTime);

            if (raceTime < bestTime) {
                bestTime = raceTime;
                winner = dog;
            }
        }

        System.out.println("\n🎉 The winner is " + winner.name + " with a time of " + String.format("%.2f", bestTime) + " seconds!");
    }
}
        DogRace.startRace(sportDog1, sportDog2);
}
