package Exercise_13;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Weather {
    int temp;
    int humidity;
    boolean cloudy;
    int chance_of_rain;

    public void changeChanceOfRain(int chance_of_rain) {
        if (chance_of_rain >= 0 && chance_of_rain <= 100) ;
        else System.out.println("Today is " +temp + " Fahrenheit");
    }
        public void printTempFahrenheit () {
            double temp = this.temp * 1.8 + 32;
            System.out.println("Today is " + temp + " Fahrenheit");
        }

    }

