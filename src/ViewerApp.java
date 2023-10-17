import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args) {

        System.out.print("""
                [1] Lights
                [2] Thermostat
                [3] Music Player
                Please choose a device:""");

        Scanner sc = new Scanner(System.in);
        int deviceChoice = sc.nextInt();

        System.out.println();

        System.out.print("""
                [1] Power On button
                [2] Power Off button
                [3] Up button
                [4] Down button
                Please choose remote control input:""");

        int input = sc.nextInt();

        Device device = switch (deviceChoice) {
            case 1 -> new Lights();
            case 2 -> new Thermostat();
            case 3 -> new MusicPlayer();
            default -> null;
        };

        RemoteControl rc = switch (input) {
            case 1 -> new RemoteControl(new OnCommand(device));
            case 2 -> new RemoteControl(new OffCommand(device));
            case 3 -> new RemoteControl(new UpCommand(device));
            case 4 -> new RemoteControl(new DownCommand(device));
            default -> null;
        };

        assert rc != null;
        rc.execute();

    }

}
