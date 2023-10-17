public class Thermostat implements Device {

    public void on() {
        System.out.println("The thermostat is turned on.");
    }

    public void off() {
        System.out.println("The thermostat is turned off.");
    }

    public void increaseTemperature() {
        System.out.println("The temperature is getting hotter.");
    }

    public void decreaseTemperature() {
        System.out.println("The temperature is getting colder.");
    }

}
