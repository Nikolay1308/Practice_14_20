package Exercise_12;

public class House {
    final String address;
    final float area;
    String ownerName;

    public House(String address, float area, String ownerName) {
        this.address = address;
        this.area = area;
        this.ownerName = ownerName;
    }

    public House(String address, float area) {
        this.address = address;
        this.area = area;
    }
}
