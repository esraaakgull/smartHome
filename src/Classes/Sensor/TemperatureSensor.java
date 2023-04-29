package Classes.Sensor;

import Classes.Control.Mediator;

public class TemperatureSensor extends Sensor<Integer> {
    public TemperatureSensor(int id, Mediator mediator) {
        super(id, mediator);
    }

    @Override
    void sendReading() {
        super.mediator.receiveTemperatureReading(this.getReading());
    }
}
