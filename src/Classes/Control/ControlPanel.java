package Classes.Control;

import java.util.Random;

public class ControlPanel {
    private final Mediator mediator;

    public ControlPanel(Mediator mediator) {
        this.mediator = mediator;
    }

    private void lightCommand(boolean isTurnedOn) {
        mediator.receiveLightCommand(isTurnedOn);
    }

    private void doorCommand(boolean isOpen) {
        mediator.receiveDoorCommand( isOpen);
    }

    private void temperatureCommand(int celcius) {
        mediator.receiveTemperatureCommand(celcius);
    }

    public void generateRandomCommands(){
        Random random = new Random();
        lightCommand(random.nextBoolean());
        doorCommand(random.nextBoolean());
        temperatureCommand(random.nextInt(1,35));
    }
}
