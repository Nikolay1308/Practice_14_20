package Practice_20_10;

import java.time.LocalTime;

public class CarsMechanic extends Mechanic{
    String[] car_types_i_can_repair;

    @Override
    public void repair() {
        System.out.println("Car repairing...");
        LocalTime currentTime = LocalTime.now();
        LocalTime after17 = LocalTime.of(17,0);
        LocalTime before7 = LocalTime.of(7,0);
        if (currentTime.isAfter(after17) || currentTime.isBefore(before7)){
            System.out.println("Garage is closed.");
        }else {
            System.out.println("Garage is open!");
        }
    }
    public void replaceWheel() {
        System.out.println("Replacing the damaged wheel...");
    }
}
