package Practice_20_3;

public class StudioApartment extends Apartment{
    private int number_of_rooms;

    @Override
    public String toString() {
        return super.toString() +"StudioApartment{" +
                "number_of_rooms=" + number_of_rooms +
                '}';
    }

    public static void main(String[] args) {
        StudioApartment s = new StudioApartment();
        Apartment a = new Apartment();
        System.out.println(s);

    }
}
