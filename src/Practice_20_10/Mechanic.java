package Practice_20_10;

public abstract class Mechanic {
    String name;
    int years_of_experience;

    public abstract void repair();
    public  void useScrewdriver() {
        System.out.println("Using screwdriver to open this screw...");
    }
}
