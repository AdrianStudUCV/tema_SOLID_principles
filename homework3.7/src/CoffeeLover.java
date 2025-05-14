import java.util.List;
import java.util.ArrayList;

// Class that uses setter injection
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    // Public setter for dependency injection
    public void setCoffeeMachines(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee() {
        if (coffeeMachines != null) {
            coffeeMachines.forEach(CoffeeMachine::start);
        } else {
            System.out.println("No coffee machines injected.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Create CoffeeMachine instances
        CoffeeMachine simple = new SimpleCoffeeMachine();
        CoffeeMachine complex = new ComplexCoffeeMachine();

        // Prepare the list
        List<CoffeeMachine> machines = new ArrayList<>();
        machines.add(simple);
        machines.add(complex);

        // Inject dependencies via public method
        CoffeeLover lover = new CoffeeLover();
        lover.setCoffeeMachines(machines);

        // Use the injected coffee machines
        lover.makeCoffee();
    }
}