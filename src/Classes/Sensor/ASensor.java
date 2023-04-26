package Classes.Sensor;

import Classes.Mediator;

public abstract class ASensor {
    private int readingValue = 0;

    protected ASensor() {
    }

    private int getReading() {
        return readingValue;
    }

    private void setReading(int readingValue) {
        this.readingValue = readingValue;
    }

    private void sendReading() {

    }


}
