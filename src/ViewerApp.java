import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args) {

        System.out.print("""
                [1] Lights
                [2] Thermostat
                [3] Music Player
                Please choose a device:\s""");

        Scanner sc = new Scanner(System.in);
        int deviceChoice = sc.nextInt();

        System.out.println();

        System.out.println("[1] Turn On\n[2] Turn Off");

        if (deviceChoice == 2){
            System.out.println("[3] Increase Temperature\n[4] Decrease Temperature");
        } else if (deviceChoice == 3){
            System.out.println("[3] Increase Volume\n[4] Decrease Volume");
        }

        System.out.print("Please choose command: ");
        int input = sc.nextInt();

        System.out.println();

        Device device = switch (deviceChoice) {
            case 1 -> new Lights();
            case 2 -> new Thermostat();
            case 3 -> new MusicPlayer();
            default -> null;
        };

        RemoteControl rc = null;

        if (input == 1) {
            rc = new RemoteControl(new OnCommand(device));
        } else if (input == 2) {
            rc = new RemoteControl(new OffCommand(device));
        } else if (input == 3) {
            if (deviceChoice == 2) {
                rc = new RemoteControl(new IncreaseTemperature(new Thermostat()));
            } else if (deviceChoice == 3) {
                rc = new RemoteControl(new IncreaseVolumeCommand(new MusicPlayer()));
            }
        } else if (input == 4) {
            if (deviceChoice == 2) {
                rc = new RemoteControl(new DecreaseTemperature(new Thermostat()));
            } else if (deviceChoice == 3) {
                rc = new RemoteControl(new DecreaseVolumeCommand(new MusicPlayer()));
            }
        }


        assert rc != null;
        rc.execute();

    }

}
