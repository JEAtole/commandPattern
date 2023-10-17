public class OnCommand implements Command{
    private Device device;

    public OnCommand(Device rc) {
        this.device = rc;
    }

    @Override
    public void execute() {
        this.device.on();
    }
}
