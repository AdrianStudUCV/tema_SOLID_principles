import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Injecting dependencies
        List<CoffeeMachine> machines = new ArrayList<>();
        machines.add(new SimpleCoffeeMachine());
        machines.add(new ComplexCoffeeMachine());

        // Creating CoffeeLover with injected machines
        CoffeeLover lover = new CoffeeLover(machines);
        lover.makeCoffee();
    }
}