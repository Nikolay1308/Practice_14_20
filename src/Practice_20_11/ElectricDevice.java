package Practice_20_11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public abstract class ElectricDevice {
    float voltage;
    boolean worksOnBatteries;
    boolean isFaulty;

    public ElectricDevice( boolean worksOnBatteries) {
        this.worksOnBatteries = worksOnBatteries;
        this.isFaulty = false;
    }

    public void turnOn() {
        System.out.println("Turning device on...");
    }
    public final void insertNewBatteries(){
        if (worksOnBatteries){
            System.out.println("Inserting new batteries to device");
        }else {
            System.out.println("This device doesn't use batteries!");
        }
    }
    public abstract void useDevice();

    public abstract void fixDevice();
}
