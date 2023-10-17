public class OffCommand implements Command{

    private Device device;

    public OffCommand(Device rc) {
        this.device = rc;
    }

    @Override
    public void execute() {
        this.device.off();
    }

}
