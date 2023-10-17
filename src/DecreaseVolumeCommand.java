public class DecreaseVolumeCommand implements Command{

    private final MusicPlayer musicPlayer;

    public DecreaseVolumeCommand(MusicPlayer mp) {
        this.musicPlayer = mp;
    }

    @Override
    public void execute() {
        this.musicPlayer.decreaseVolume();
    }

}
