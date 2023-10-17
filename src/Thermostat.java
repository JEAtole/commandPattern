public class Thermostat implements Device {

    public void on() {
        System.out.println("The thermostat is turned on.");
    }

    public void off() {
        System.out.println("The thermostat is turned off.");
    }

    public void up() {
        System.out.println("The temperature is getting hotter.");
    }

    public void down() {
        System.out.println("The temperature is getting colder.");
    }

}
