import Exercise_15.Memory;

public class Main {
    public static void addToMemory(int a, float b, String c){
        System.out.println(Memory.add(a));
        System.out.println(Memory.add(b));
        System.out.println(Memory.add(c));
    }

    public static void main(String[] args) {
        addToMemory(9,2.5f,"Nikolay");
    }

}
