public class RemoteControl {

    public Command command;

    public RemoteControl(Command c) {
        this.command = c;
    }

    public void execute(){
        this.command.execute();
    }

}
