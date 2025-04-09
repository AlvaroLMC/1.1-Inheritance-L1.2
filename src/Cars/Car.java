package Cars;

public class Car {
    static String brand = "Chevrolet";
    static String model = "Cruze";
    final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void slowdown() {
        System.out.println("Método estático: El vehículo está frenando!");
    }

    public void acceleration() {
        System.out.println("Método NO estático: El vehículo está acelerando!");
    }

    public void displayCarInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Potencia: " + power);
    }
}