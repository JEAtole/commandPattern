public class DownCommand implements Command{

    private Device device;

    public DownCommand(Device rc) {
        this.device = rc;
    }

    @Override
    public void execute() {
        this.device.down();
    }

}
