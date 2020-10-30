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

        car2.model = "Saab";
        car2.price = 250_000;
        car2.year = 2005;

        Car car3 = new Car();
        car3.model = "Ford";
        car3.year = 1999;
        car3.price = 38_000;

        Car car4 = new Car();
        car4.model = "Audi";
        car4.year = 2001;
        car4.price = 138_000;

        Car car5 = new Car();
        car5.model = "Mazda";
        car5.year = 1982;
        car5.price = 18_000;

        // System.out.println(car1.model + " kostar " + car1.price + "kr.");
        System.out.printf("%s från %d kostar %,d kr \n", car1.model, car1.year, car1.price); // Utskrift med formatering
        System.out.printf("%s från %d kostar %,d kr \n", car2.model, car2.year, car2.price);
        System.out.printf("%s från %d kostar %,d kr \n", car3.model, car3.year, car3.price);
        System.out.printf("%s från %d kostar %,d kr \n", car4.model, car4.year, car4.price);
        System.out.printf("%s från %d kostar %,d kr \n", car5.model, car5.year, car5.price);

    }
}
