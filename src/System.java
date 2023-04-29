import Classes.Control.ControlPanel;
import Classes.Control.Mediator;
import Classes.Sensor.LightSensor;
import Classes.Sensor.Sensor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class System  {
    static Mediator mediator;

    public static class Simulator extends TimerTask{
        @Override
        public void run() {
            mediator.newSecond();
        }
    }

    public static void main(String[] args) {
        // Mediator class already has one control panel in its constructor
        // which ensures that it has at least one panel serving.
        mediator = new Mediator();

        // more control panels can be added by...
        // mediator.addControlPanel(new ControlPanel(mediator));

        Timer timer = new Timer();
        timer.schedule(new Simulator(), 0, 1000);

    }

}