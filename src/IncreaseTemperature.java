public class IncreaseTemperature implements Command{

    private final Thermostat thermostat;

    public IncreaseTemperature(Thermostat t) {
        this.thermostat = t;
    }

    @Override
    public void execute() {
        this.thermostat.increaseTemperature();
    }

}
