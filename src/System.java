import Classes.Actuator.AActuator;
import Classes.Actuator.DoorLock;
import Classes.Actuator.LightBulb;
import Classes.Actuator.Thermostat;
import Classes.ControlPanel;
import Classes.Mediator;
import Classes.Sensor.ASensor;
import Classes.Sensor.LightSensor;
import Classes.Sensor.MotionSensor;
import Classes.Sensor.TemperatureSensor;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class System {
    static ArrayList<ASensor> sensors = new ArrayList<>();
    static ArrayList<AActuator> actuators = new ArrayList<>();
    static ControlPanel controlPanel = new ControlPanel();
    static Mediator mediator;
    public static void main(String[] args) {
        LightSensor lightSensor = new LightSensor();
        MotionSensor motionSensor = new MotionSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        sensors.add(lightSensor);
        sensors.add(motionSensor);
        sensors.add(temperatureSensor);

        Thermostat thermostat = new Thermostat();
        DoorLock doorLock = new DoorLock();
        LightBulb lightBulb = new LightBulb();

        actuators.add(thermostat);
        actuators.add(doorLock);
        actuators.add(lightBulb);

        mediator  = new Mediator(sensors, actuators, controlPanel);


    }
}