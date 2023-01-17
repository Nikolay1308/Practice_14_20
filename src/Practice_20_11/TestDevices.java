package Practice_20_11;

public class TestDevices {
    public static void main(String[] args) {
        ElectricDevice TV = new TV(75);
        ElectricDevice Cellphone = new Cellphone("Samsung");
        RepairElectricDevice(TV);
        RepairElectricDevice(Cellphone);
    }

    public static void RepairElectricDevice(ElectricDevice Device) {
        if (Device.worksOnBatteries) {
            Device.insertNewBatteries();
            if (Device.isFaulty) {
                return;
            }
            Device.fixDevice();
        }
                if (Device instanceof TV tv){
                    System.out.println("TV size is " +tv.screenSize);
                }
                if (Device instanceof Cellphone cellphone){
                    System.out.println("Cellphone brand is " +cellphone.brand);
        }
        System.out.println("Fixing is done !");
    }
}











