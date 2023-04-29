package Classes.Sensor;

import Classes.Control.Mediator;

public class LightSensor extends Sensor<Boolean> {
    public LightSensor(int id, Mediator mediator) {
        super(id, mediator);
    }

    @Override
    void sendReading() {
        super.mediator.receiveLightReading(this.getReading());
    }
}
