public class MyOwnAutoShop {
    public static void main(String[] args) throws Exception {
        Sedan sedan = new Sedan(160, 22000, "Blue",22);
        Ford ford1 = new Ford(180, 30000, "Red", 2022, 2000);
        Ford ford2 = new Ford(220, 40000, "GrabberBlue", 2022,4000 );
        Car car = new Car(160, 20000, "Black");

        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}
