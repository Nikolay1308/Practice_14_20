package Exercise_9;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Meal {
    String name;
    Boolean vegan;
    float price;

    public Meal(String name, Boolean vegan, float price) {
        this.name = name;
        this.vegan = false;
        this.price = price;
    }
    public void createMeals(){
        System.out.println("Meals: ");
    }
}
