package Exercise_4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Dog {
    String name;
    int age;
    String breed;

    public void createDog(){               // exercise 4
        System.out.println("My Dog");
    }
    public void bark() {                   // exercise 5
        System.out.println("woof! woof!" + name);
    }
}