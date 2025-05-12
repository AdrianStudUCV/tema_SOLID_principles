import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> machines;

    public CoffeLover(List<CoffeMachine> machines) {
        this.machines = machines;
    }

    public void makeCoffee() {
        for (CoffeMachine machine : machines) {
            machine.start();
        }
    }
}
