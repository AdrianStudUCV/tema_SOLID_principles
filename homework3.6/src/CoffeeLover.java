import java.util.List;
import java.util.ArrayList;
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    public CoffeeLover(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee() {
        coffeeMachines.forEach(CoffeeMachine::start);
    }
}