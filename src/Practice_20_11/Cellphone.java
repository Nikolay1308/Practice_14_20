package Practice_20_11;

public class Cellphone extends ElectricDevice{
    String brand;

    public Cellphone(String brand) {
        super(true);
        this.brand = brand;
        this.worksOnBatteries = true;
    }

    @Override
    public void useDevice() {
        System.out.println("The phone on talking.");
    }

    @Override
    public void fixDevice() {
        if (isFaulty){
            System.out.println("Cellphone fixing.");
        }else {
            System.out.println("This cellphone working properly. ");
        }

    }
}
