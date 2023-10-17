public class DecreaseTemperature implements Command{

    private final Thermostat thermostat;

    public DecreaseTemperature(Thermostat t) {
        this.thermostat = t;
    }

    @Override
    public void execute() {
        this.thermostat.decreaseTemperature();
    }

}
