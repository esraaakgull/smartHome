package Classes;

import Classes.Actuator.AActuator;
import Classes.Sensor.ASensor;

import java.util.ArrayList;

public class Mediator {
    private ArrayList<ASensor> sensors;
    private ArrayList<AActuator> actuators;
    private ControlPanel controlPanel;

    public Mediator(ArrayList<ASensor> sensors, ArrayList<AActuator> actuators, ControlPanel controlPanel) {
        this.sensors = sensors;
        this.actuators = actuators;
        this.controlPanel = controlPanel;
    }

    public void sendReading() {
    }
}
