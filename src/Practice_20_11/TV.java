package Practice_20_11;

public class TV extends ElectricDevice {
    float screenSize;

    public TV(float screenSize) {
        super(false);
        this.screenSize = screenSize;
    }

    @Override
    public void useDevice() {
        System.out.println("Watching TV");
    }

    @Override
    public void fixDevice() {
        if (isFaulty){
            System.out.println("TV fixing.");
            isFaulty = false;
        }else {
            System.out.println("This TV is working properly.");
        }
    }
}
