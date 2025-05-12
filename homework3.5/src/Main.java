import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeMachine userMachine1 = new SimpleCoffeMachine();
        CoffeMachine userMachine2 = new ComplexCoffeMachine();

        CoffeLover user = new CoffeLover(Arrays.asList(userMachine1, userMachine2));
        user.makeCoffee();
    }
}