public class IncreaseVolumeCommand implements Command{

    private final MusicPlayer musicPlayer;

    public IncreaseVolumeCommand(MusicPlayer mp) {
        this.musicPlayer = mp;
    }

    @Override
    public void execute() {
        this.musicPlayer.increaseVolume();
    }

}
