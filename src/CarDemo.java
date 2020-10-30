public class CarDemo {
    public static void main(String[] args) {
        // Skapa några objekt(instanser)

        // 1. Skapa referensvariabel
        Car car1;
        // 2. Skapa objektet(minnesutrymme) med  new
        car1 = new Car();

        System.out.println(car1); // Skriver ut referensvariabeln i hashcode Car@5f184fc6

        // Steg 1 och 2 i samma sats
        Car car2 = new Car();
        System.out.println(car2); // Car@3feba861

        // Arbeta med instansvaribler(egenskaper/properties)
        car1.model = "Volvo";
        car1.year = 2020;
        car1.price = 350_000;

        car2.model = "Volksvagen";
        car2.year = 2019;
        car2.price = 300_000;

        Car car3 = new Car();
        car3.model = "Audi";
        car3.year = 2018;
        car3.price = 200_000;

        // System.out.println(car1.model + " kostar " + car1.price + "kr.");
        System.out.printf("%s från %d kostar %,d kr \n", car1.model, car1.year, car1.price); // Utskrift med formatering
        System.out.printf("%s från %d kostar %,d kr \n", car2.model, car2.year, car2.price);
        System.out.printf("%s från %d kostar %,d kr \n", car3.model, car3.year, car3.price);

    }
}
