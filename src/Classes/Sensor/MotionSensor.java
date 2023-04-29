package Classes.Sensor;

import Classes.Control.Mediator;

public class MotionSensor extends Sensor<Boolean> {
    public MotionSensor(int id, Mediator mediator) {
        super(id, mediator);
    }

    @Override
    void sendReading() {
        super.mediator.receiveMotionReading(this.getReading());
    }
}
