package Practice_20_2;

public class Orange extends Fruit{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Peeling the orange and eating !");
    }

    public static void main(String[] args) {
        Orange o = new Orange();
        o.eat();
    }
}
