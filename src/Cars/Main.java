package Cars;

public class Main {
    public static void main(String[] args) {

        Car instance = new Car(200);
        Car instance1 = new Car(100);

        Car.slowdown();

        instance.acceleration();
        instance1.acceleration();

        instance.displayCarInfo();
        instance1.displayCarInfo();
    }
}
