public class UpCommand implements Command{

    private Device device;

    public UpCommand(Device rc) {
        this.device = rc;
    }

    @Override
    public void execute() {
        this.device.up();
    }

}
