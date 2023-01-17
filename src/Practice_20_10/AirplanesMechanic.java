package Practice_20_10;

public class AirplanesMechanic extends Mechanic{
    int rank;

    @Override
    public void repair() {
        System.out.println("Airplane repairing...");
    }
    public void checkEngine() {
        System.out.println("Checking the engine...");
    }
}
