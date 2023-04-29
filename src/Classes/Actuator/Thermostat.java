package Classes.Actuator;

import Classes.Control.Mediator;

public class Thermostat extends Actuator<Integer> {
    public Thermostat(int id, Mediator mediator) {
        super(id, mediator,"temperature");
    }

    @Override
    public void performAction(Integer temperatureValue) {
        super.mediator.setTemperatureValue(temperatureValue);
    }
}
