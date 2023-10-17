public class MusicPlayer implements Device {

    public void on() {
        System.out.println("The music player is turned on.");
    }

    public void off() {
        System.out.println("The music player is turned off.");
    }

    public void up() {
        System.out.println("The music is getting louder.");
    }

    public void down() {
        System.out.println("The music is getting quieter.");
    }

}
