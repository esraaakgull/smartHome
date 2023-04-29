package Classes.Sensor;

import Classes.Control.Mediator;

public abstract class Sensor<T> {
    private T readingValue;
    private final int id;
    protected final Mediator mediator;

    public Sensor(int id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    abstract void sendReading();

    public T getReading() {
        return this.readingValue;
    }

    public void setReading(T readingValue) {
        this.readingValue = readingValue;
        sendReading();
    }

    public int getId() {
        return this.id;
    }

}
