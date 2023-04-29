package Classes.Control;

import Classes.Actuator.DoorLock;
import Classes.Actuator.LightBulb;
import Classes.Actuator.Thermostat;
import Classes.Sensor.LightSensor;
import Classes.Sensor.MotionSensor;
import Classes.Sensor.TemperatureSensor;

import java.util.ArrayList;

public class Mediator {
    private final LightSensor lightSensor;
    private final MotionSensor motionSensor;
    private final TemperatureSensor temperatureSensor;
    private final LightBulb lightBulb;
    private final DoorLock doorLock;
    private final Thermostat thermostat;
    private ArrayList<ControlPanel> controlPanels = new ArrayList<>();

    public Mediator() {
        this.lightSensor = new LightSensor(1, this);
        this.motionSensor = new MotionSensor(2, this);
        this.temperatureSensor = new TemperatureSensor(3, this);
        this.lightBulb = new LightBulb(1, this);
        this.doorLock = new DoorLock(2, this);
        this.thermostat = new Thermostat(3, this);
        this.controlPanels.add(new ControlPanel(this));
    }

    // RECEIVE SENSOR READING - START

    public void receiveLightReading(boolean isTurnedOn ) {
        System.out.println("Lights are " + (isTurnedOn ? "on" : "off"));
    }

    public void receiveMotionReading(boolean isOpen){
        System.out.println("Door is " + (isOpen ? "open" : "closed"));
    }

    public void receiveTemperatureReading(float temperature){
        System.out.println("Temperature is " + temperature);
        if (temperature<20){
            System.out.println("Temperature is too low! Setting to 23...");
            thermostat.performAction(23);
        } else if (temperature > 25){
            System.out.println("Temperature is too high! Setting to 23...");
            thermostat.performAction(23);
        }
    }

    // RECEIVE SENSOR READING - END

    // DELIVER ACTUATOR COMMAND - START
    public void setLightValue(boolean isTurnedOn){
        lightSensor.setReading(isTurnedOn);
    }

    public void setDoorValue(boolean isOpen){
        motionSensor.setReading(isOpen);
    }

    public void setTemperatureValue(Integer temperatureValue){
        temperatureSensor.setReading(temperatureValue);
    }

    // DELIVER ACTUATOR COMMAND - END


    //RECEIVE CONTROL COMMAND - START

    // due being protected functions, these can only be accessed inside Mediator or through control panel
    protected void receiveLightCommand(boolean isTurnedOn) {
        lightBulb.performAction(isTurnedOn);
    }

    protected void receiveDoorCommand(boolean isOpen) {
        doorLock.performAction(isOpen);
    }

    protected void receiveTemperatureCommand(int celcius) {
        thermostat.performAction(celcius);
    }

    // RECEIVE CONTROL COMMAND - END

    public void addControlPanel(ControlPanel newControlPanel) {
        this.controlPanels.add(newControlPanel);
    }

    public void newSecond(){
        for (ControlPanel cp: controlPanels) {
            cp.generateRandomCommands();
        }
    }

}
